package Api_Testing;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

import org.testng.Assert;
import static io.restassured.RestAssured.*;

public class api_test_class {
	
	
	@Test
	public static void ekle() 
	{
		String api="https://reqres.in/api/users/2";	
		int code=get(api).getStatusCode();
		System.out.println("Code: "+code);
		System.out.println("text: \n"+get(api).jsonPath().get().toString());
		Assert.assertEquals(code, 200);
		
	}
	
	@Test
	public static void dene() 
	{
		
		
	}
	
	public static void main(String args[]) 
	{
		ekle();
	}
	
	
}


