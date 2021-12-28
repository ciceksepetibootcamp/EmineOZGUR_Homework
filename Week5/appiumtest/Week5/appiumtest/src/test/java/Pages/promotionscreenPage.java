package Pages;

import java.sql.Driver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Locators.promotionscreenLocator;
import Tests.BaseTest;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class promotionscreenPage extends BaseTest{
	
	public promotionscreenPage(AppiumDriver<MobileElement> driver)
	{
		
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		
		
	}
		

	@AndroidFindBy(xpath=promotionscreenLocator.btn_enter_xpath)
	public MobileElement btn_enter_xpath;
	
	@AndroidFindBy(xpath=promotionscreenLocator.txt_next_xpath)
	public MobileElement txt_next_xpath;
	
	@AndroidFindBy(xpath=promotionscreenLocator.txt_close_xpath)
	public MobileElement txt_close_xpath;
	
	
	public void enter() 
	{
		txt_next_xpath.click();
		txt_next_xpath.click();
		txt_close_xpath.click();
		
	}
	
	
}
