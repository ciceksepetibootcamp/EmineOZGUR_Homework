package Tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.Keys;
import org.springframework.core.annotation.Order;

import Tests.promotionscreenTest;
import io.appium.java_client.MobileElement;
import junit.framework.Assert;
import Pages.homePage;
import Pages.promotionscreenPage;


public class homepageTest extends BaseTest{
	
	promotionscreenPage promotionscreenpage =new promotionscreenPage(driver);
	
	homePage homepage =new homePage(driver);
	
	@Order(1)
	@Test
	public void search_product() {
		
		MobileElement btn_enter_xpath= (MobileElement) driver.findElementByXPath("//android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView[2]");
		btn_enter_xpath.click();
		promotionscreenpage.enter();
		
		MobileElement txt_dont_allow_permission_xpath =(MobileElement) driver.findElementByXPath("//*[@text=\"Konum iznini daha sonra vermek istiyorum\"]");
						
		txt_dont_allow_permission_xpath.click();
		
		homepage.txtfield_searchbar_id.click();
		homepage.btn_searchtxt_input_id.sendKeys("�ikolata");
		driver.getKeyboard().pressKey(Keys.ENTER);	
		
	}
	
	@Order(2)
	@Test
	public void delivery_to_address_select()
	{
		MobileElement btn_enter_xpath= (MobileElement) driver.findElementByXPath("//android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView[2]");
		btn_enter_xpath.click();
		promotionscreenpage.enter();
		
		MobileElement txt_dont_allow_permission_xpath =(MobileElement) driver.findElementByXPath("//*[@text=\"Konum iznini daha sonra vermek istiyorum\"]");
						
		txt_dont_allow_permission_xpath.click();
		MobileElement btn_delivery_time_id =(MobileElement) driver.findElementById("com.inomera.sm:id/deliveryPreferenceConstraint");
		btn_delivery_time_id.click();
		
		homepage.delivery_select();	
		String town = homepage.txt_control_town_id.getText();
		String region = homepage.txt_control_region_id.getText();
		
		Assert.assertEquals("Bak�rk�y", town);
		Assert.assertEquals("Cevizlik Mh.", region);
	}
	

}
