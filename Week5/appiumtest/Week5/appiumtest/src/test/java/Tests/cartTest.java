package Tests;

import static org.junit.Assert.*;

import org.junit.Test;

import Pages.cartPage;
import Pages.homePage;
import Pages.productdetailPage;
import Pages.promotionscreenPage;
import io.appium.java_client.MobileElement;

public class cartTest extends BaseTest{

promotionscreenPage promotionscreenpage =new promotionscreenPage(driver);
	
	homePage homepage =new homePage(driver);
	
	productdetailPage productdetailpage = new productdetailPage(driver);
	
	cartPage cartpage =new cartPage(driver);
	
	@Test
	public void delete_products() {
		MobileElement btn_enter_xpath= (MobileElement) driver.findElementByXPath("//android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView[2]");
		btn_enter_xpath.click();
		promotionscreenpage.enter();
		
		MobileElement txt_dont_allow_permission_xpath =(MobileElement) driver.findElementByXPath("//*[@text=\"Konum iznini daha sonra vermek istiyorum\"]");
						
		txt_dont_allow_permission_xpath.click();
		
		homepage.delivery_select();
		homepage.btn_products_id.click();
		homepage.btn_snack_xpath.click();
		
		productdetailpage.btn_first_product_xpath.click();
		productdetailpage.btn_add_cart_id.click();
		productdetailpage.btn_back_xpath.click();
		cartpage.btn_cart_id.click();
		cartpage.txt_popup_id.click();
		cartpage.btn_cart_id.click();
		cartpage.delete_product();
		cartpage.txt_control_empty_cart_xpath.isDisplayed();
		
	}

}
