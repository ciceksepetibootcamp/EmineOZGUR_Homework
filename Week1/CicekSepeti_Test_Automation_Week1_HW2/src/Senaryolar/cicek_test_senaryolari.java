package Senaryolar;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


import org.openqa.selenium.*;

public class cicek_test_senaryolari {
	
	

	public void setup() 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pc\\Downloads\\chromedriver_win32\\chromedriver.exe");		
		
	}
	
	@Test
	public void CSC1() 
	{
		
		setup();
		WebDriver driver = new ChromeDriver();	
		driver.get("https://www.ciceksepeti.com/");
		String str_closeicon="/html/body/div[5]";
		WebElement closeicon =driver.findElement(By.xpath(str_closeicon));
		closeicon.click();
		driver.findElement(By.xpath("/html/body/main/div/div[1]/div[1]/div[2]/div[2]/div/button/span[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"district-search-0\"]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"district-search-0\"]/input")).sendKeys("çorlu");
		
		driver.findElement(By.xpath("(/html/body/main/div/div[1]/div[1]/div[2]/div[2]/div/div/div[1]/div/div/div[3]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("/html/body/div[3]/div[4]/div[1]/div[2]/nav/ul/li[2]/span/a/span[2]")).click();;
		
		JavascriptExecutor js = (JavascriptExecutor) driver;  
		
		js.executeScript("window.scrollBy(0,800)");
		
		driver.findElement(By.xpath("(//*[@class=\"products__item-inner\"])[2]")).click();
		driver.findElement(By.xpath("/html/body/main/form/div/div/div[2]/div[2]/div[4]/div[5]/div[2]/div[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"productDetailSend\"]/div/div/div[2]/div[2]/div[4]/div[5]/div[2]/div[2]/select/option[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"productDetailSend\"]/div/div/div[2]/div[2]/div[4]/div[18]/div[5]/button/span")).click();
		
		driver.findElement(By.xpath("/html/body/main/div[1]/div[2]/div/div/div/h3")).isDisplayed();
		
	}
	@Test
	public void CSC2() 
	{
		
		setup();
		WebDriver driver = new ChromeDriver();	
		driver.get("https://www.ciceksepeti.com/");
		String str_closeicon="/html/body/div[5]";
		WebElement closeicon =driver.findElement(By.xpath(str_closeicon));
		closeicon.click();
		driver.findElement(By.xpath("/html/body/main/div/div[1]/div[1]/div[2]/div[2]/div/button/span[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"district-search-0\"]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"district-search-0\"]/input")).sendKeys("çorlu");
		
		driver.findElement(By.xpath("(/html/body/main/div/div[1]/div[1]/div[2]/div[2]/div/div/div[1]/div/div/div[3]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("/html/body/div[3]/div[4]/div[1]/div[2]/nav/ul/li[2]/span/a/span[2]")).click();;
		
		JavascriptExecutor js = (JavascriptExecutor) driver;  
		
		js.executeScript("window.scrollBy(0,800)");
		
		driver.findElement(By.xpath("(//*[@class=\"products__item-inner\"])[6]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"productDetailSend\"]/div/div/div[2]/div[2]/div[4]/div[6]/div[2]/div[1]/span[2]")).click();
		String kontrol_txt=driver.findElement(By.xpath("//*[@id=\"productDetailSend\"]/div/div/div[2]/div[2]/div[2]/div/div[1]/h1/span")).getText();
		
		driver.findElement(By.xpath("//*[@id=\"productDetailSend\"]/div/div/div[2]/div[2]/div[4]/div[19]/div[5]/button/span")).click();
		
		driver.findElement(By.xpath("/html/body/main/div[1]/div[2]/div/div/div/h3")).isDisplayed();
		
		if(kontrol_txt==driver.findElement(By.xpath("//*[@id=\"shoppingCartForm\"]/div/div/div[1]/div[2]/div/h3/a")).getText()) 
		{
		System.out.println("Basarili");	
		}
		}
		
	
}
