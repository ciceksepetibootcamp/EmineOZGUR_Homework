package Tests;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import Pages.promotionscreenPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class BaseTest{

	public static AppiumDriver<MobileElement> driver;
	
	
	@BeforeClass
	public static void test() throws Exception 
	{
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability("platformName", "Android");
		desiredCapabilities.setCapability("deviceName", "emulator-5554");
		desiredCapabilities.setCapability("app", "C:\\Users\\Pc\\Downloads\\Migros Sanal Market_v6.2.11_apkpure.com.apk");
		desiredCapabilities.setCapability("appPackage", "com.inomera.sm");
		desiredCapabilities.setCapability("appActivity", "com.inomera.sm.ui.deeplink.DeepLinkActivity");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AndroidDriver<MobileElement>(url,desiredCapabilities);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		System.out.println("deneme");
		
		
	}
	
	@AfterClass
	public static void teardown()
	{
		driver.close();
		
	}

}
