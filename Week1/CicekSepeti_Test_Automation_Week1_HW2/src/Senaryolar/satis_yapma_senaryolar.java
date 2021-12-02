package Senaryolar;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



import org.openqa.selenium.*;

public class satis_yapma_senaryolar {
	public void setup() 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pc\\Downloads\\chromedriver_win32\\chromedriver.exe");		
		
	}
	
	@Test
	public void CSCSY1() 
	{
		
		setup();
		WebDriver driver = new ChromeDriver();	
		driver.get("https://www.ciceksepeti.com/");
		String str_closeicon="/html/body/div[5]";
		WebElement closeicon =driver.findElement(By.xpath(str_closeicon));
		closeicon.click();
		
		driver.get("https://www.ciceksepeti.com/ciceksepetinde-satis-yap");
		driver.findElement(By.xpath("//*[@id=\"icon-close-button-1635235065434\"]")).click();
		driver.findElement(By.xpath("/html/body/main/div/div/div[1]/div/div[1]/a")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div/ul/li[1]")).isDisplayed();
		
		}
	
	@Test
	public void CSCSY3() 
	{
		setup();
		WebDriver driver = new ChromeDriver();	
		driver.get("https://www.ciceksepeti.com/");
		String str_closeicon="/html/body/div[5]";
		WebElement closeicon =driver.findElement(By.xpath(str_closeicon));
		closeicon.click();
		
		driver.get("https://www.ciceksepeti.com/ciceksepetinde-satis-yap");
		driver.findElement(By.id("icon-close-button-1635235065434")).click();
		driver.findElement(By.xpath("/html/body/main/div/div/div[1]/div/div[1]/a")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div/div[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/section[1]/div[2]/div/div/div/div/div/div/h2")).isDisplayed();
		
		
	}

}
