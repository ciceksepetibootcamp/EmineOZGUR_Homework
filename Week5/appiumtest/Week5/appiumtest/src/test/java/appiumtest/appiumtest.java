package appiumtest;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class appiumtest {
	
	static AndroidDriver<MobileElement> driver;
	@BeforeClass
	public static void setup() throws Exception 
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
		
	}

	@Test
	public void test() {
		MobileElement btn_enter_xpath= (MobileElement) driver.findElementByXPath("//android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView[2]");
		btn_enter_xpath.click();
		MobileElement txt_next_xpath = (MobileElement) driver.findElementByXPath("//*[@text=\"Sonraki\"]");
		txt_next_xpath.click();
		txt_next_xpath.click();	
		MobileElement txt_close_xpath = (MobileElement) driver.findElementByXPath("//*[@text=\"Kapat\"]");
		txt_close_xpath.click();
		MobileElement txt_dont_allow_permission_xpath =(MobileElement) driver.findElementByXPath("//*[@text=\"Konum iznini daha sonra vermek istiyorum\"]");
						
		txt_dont_allow_permission_xpath.click();
		MobileElement btn_delivery_time_id =(MobileElement) driver.findElementById("com.inomera.sm:id/deliveryPreferenceConstraint");
		btn_delivery_time_id.click();
		
		
	}

}
