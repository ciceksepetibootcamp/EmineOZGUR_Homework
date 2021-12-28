package Tests;

import static org.junit.Assert.*;

import org.junit.Test;
import Pages.promotionscreenPage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
public class promotionscreenTest extends BaseTest{

	
	@Test
	public void enter_app() 
	{

		promotionscreenPage deneme =new promotionscreenPage(driver);
			
		MobileElement btn_enter_xpath= (MobileElement) driver.findElementByXPath("//android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView[2]");
		btn_enter_xpath.click();
		deneme.enter();
		
		MobileElement txt_dont_allow_permission_xpath =(MobileElement) driver.findElementByXPath("//*[@text=\"Konum iznini daha sonra vermek istiyorum\"]");
						
		txt_dont_allow_permission_xpath.click();
		MobileElement btn_delivery_time_id =(MobileElement) driver.findElementById("com.inomera.sm:id/deliveryPreferenceConstraint");
		btn_delivery_time_id.click();
		
		
	}

}
