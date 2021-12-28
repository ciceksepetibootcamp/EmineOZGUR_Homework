package appiumtest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class migrostest {

	
	static AppiumDriver<MobileElement> driver;
	
	
	
	public static void main(String[] args) {
		
		try
		{
			openapp();
		}catch(Exception exp)
		{
			System.out.println(exp.getMessage());
		}
		

	}

	
	public static void openapp() throws Exception
	{
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability("platformName", "Android");
		desiredCapabilities.setCapability("deviceName", "emulator-5554");
		desiredCapabilities.setCapability("app", "C:\\Users\\Pc\\Downloads\\Migros Sanal Market_v6.2.11_apkpure.com.apk");
		desiredCapabilities.setCapability("appPackage", "com.inomera.sm");
		desiredCapabilities.setCapability("appActivity", "com.inomera.sm.ui.deeplink.DeepLinkActivity");
	
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AndroidDriver<MobileElement>(url,desiredCapabilities);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		System.out.println("deneme");
		
		MobileElement btn_enter_xpath= (MobileElement) driver.findElementByXPath("//android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView[2]");
		
		//MobileElement txt_next_xpath = (MobileElement) driver.findElementById("wis-l-145212");
		
		
		
		
		btn_enter_xpath.click();
		MobileElement txt_next_xpath = (MobileElement) driver.findElementByXPath("//*[@text=\"Sonraki\"]");
		
		txt_next_xpath.click();
		txt_next_xpath.click();
		MobileElement txt_close_xpath = (MobileElement) driver.findElementByXPath("//*[@text=\"Kapat\"]");
		
		txt_close_xpath.click();
		MobileElement txt_dont_allow_permission_xpath =(MobileElement) driver.findElementByXPath("//*[@text=\"Konum iznini daha sonra vermek istiyorum\"]");
		
		txt_dont_allow_permission_xpath.click();
		
		/*
		txt_next_xpath.click();
		txt_next_xpath.click();
		txt_close_xpath.click();
		txt_dont_allow_permission_xpath.click();
		*/
			
		
	}
}
