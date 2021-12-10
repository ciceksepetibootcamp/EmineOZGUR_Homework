package Api_Testing;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import org.testng.Assert;
import static io.restassured.RestAssured.*;

import java.util.HashMap;

public class api_test_class {
	
	
	@Test
	public static void test_getAllVideoGames() 
	{
		given()
		.when()
		.get("http://localhost:8080/app/videogames")
		.then()
		.statusCode(200);
	}
	
	@Test
	public static void test_addNewVideoGame() 
	{
		HashMap data=new HashMap();
		data.put("id", "100");
		data.put("name", "Spider-Man");
		data.put("releaseDate", "2021-12-10T18:55:58.510Z");
		data.put("reviewScore", "5");
		data.put("category", "Adventure");
		data.put("rating", "Universal");
		
		Response res=
		given()
		.contentType("application/json")
		.body(data)
		.when()
		.post("http://localhost:8080/app/videogames")
		.then()
		.statusCode(200)
		.log().body()
		.extract().response();
		
		String jsonString =res.asString();
		Assert.assertEquals(jsonString.contains("Record Added Successfully"), true);
		
	}
	
	@Test
	public void test_getVideoGame()
	
	{
		given()
		.when()
		.get("\"http://localhost:8080/app/videogames/100\"")
		.then()
		.statusCode(200)
		.log().body()
		.body("videoGame.id", equalTo("100"))
		.body("videoGame.name", equalTo("Spider-Man"));
		
		
	}
	
	public void test_UpdateVideoGame()
	{
		HashMap data=new HashMap();
		data.put("id", "100");
		data.put("name", "Spider-Man");
		data.put("releaseDate", "2021-12-10T18:55:58.510Z");
		data.put("reviewScore", "5");
		data.put("category", "Adventure");
		data.put("rating", "Universal");
		
		
		given()
		.contentType("application/json")
		.body(data)
		.when()
		.post("http://localhost:8080/app/videogames")
		.then()
		.statusCode(200)
		.log().body()
		.body("videoGame.id", equalTo("100"))
		.body("videoGame.name", equalTo("Pacman"));
		
		
		
	}
	
}


