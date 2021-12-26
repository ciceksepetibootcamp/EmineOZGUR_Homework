package Tests;

import static org.junit.Assert.*;

import org.junit.Test;

import Pages.homePage;
import Pages.productdetailPage;
import Pages.promotionscreenPage;
import io.appium.java_client.MobileElement;

public class productdetailTest extends BaseTest {
	
	promotionscreenPage promotionscreenpage =new promotionscreenPage(driver);
	
	homePage homepage =new homePage(driver);
	
	productdetailPage productdetailpage = new productdetailPage(driver);

	@Test
	public void add_product() {
		MobileElement btn_enter_xpath= (MobileElement) driver.findElementByXPath("//android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView[2]");
		btn_enter_xpath.click();
		promotionscreenpage.enter();
		//Elementler farklý sayfalarda olduðu için burada tanýmladým.
		MobileElement txt_dont_allow_permission_xpath =(MobileElement) driver.findElementByXPath("//*[@text=\"Konum iznini daha sonra vermek istiyorum\"]");
						
		txt_dont_allow_permission_xpath.click();
		
		homepage.delivery_select();
		homepage.btn_products_id.click();
		homepage.btn_snack_xpath.click();
		
		productdetailpage.btn_first_product_xpath.click();
		productdetailpage.btn_add_cart_id.click();
		productdetailpage.btn_increase_xpath.isDisplayed();
		productdetailpage.btn_decrease_xpath.isDisplayed();
			
		
	}
	
	@Test
	public void decrease_product() {
		MobileElement btn_enter_xpath= (MobileElement) driver.findElementByXPath("//android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView[2]");
		btn_enter_xpath.click();
		promotionscreenpage.enter();
		//Elementler farklý sayfalarda olduðu için burada tanýmladým.
		MobileElement txt_dont_allow_permission_xpath =(MobileElement) driver.findElementByXPath("//*[@text=\"Konum iznini daha sonra vermek istiyorum\"]");
						
		txt_dont_allow_permission_xpath.click();
		
		homepage.delivery_select();
		homepage.btn_products_id.click();
		homepage.btn_snack_xpath.click();
		
		productdetailpage.btn_first_product_xpath.click();
		productdetailpage.btn_add_cart_id.click();
		productdetailpage.btn_decrease_xpath.click();
		productdetailpage.btn_increase_xpath.isDisplayed();
		productdetailpage.btn_decrease_xpath.isDisplayed();
			
		
	}
	
	public void fovorites_add_product() {
		MobileElement btn_enter_xpath= (MobileElement) driver.findElementByXPath("//android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView[2]");
		btn_enter_xpath.click();
		promotionscreenpage.enter();
		//Elementler farklý sayfalarda olduðu için burada tanýmladým.
		MobileElement txt_dont_allow_permission_xpath =(MobileElement) driver.findElementByXPath("//*[@text=\"Konum iznini daha sonra vermek istiyorum\"]");
						
		txt_dont_allow_permission_xpath.click();
		
		homepage.delivery_select();
		homepage.btn_products_id.click();
		homepage.btn_snack_xpath.click();
		
		productdetailpage.btn_first_product_xpath.click();
		productdetailpage.btn_add_to_favorites_xpath.click();
		productdetailpage.btn_sign_in_id.isDisplayed();
		
	}

}
