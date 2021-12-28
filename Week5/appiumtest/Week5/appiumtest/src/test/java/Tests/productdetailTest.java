package Tests;

import static org.junit.Assert.*;

import org.junit.Assert;
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
		
		MobileElement txt_dont_allow_permission_xpath =(MobileElement) driver.findElementByXPath("//*[@text=\"Konum iznini daha sonra vermek istiyorum\"]");
						
		txt_dont_allow_permission_xpath.click();
		
		homepage.delivery_select();
		homepage.btn_products_id.click();
		homepage.btn_snack_xpath.click();
		
		productdetailpage.btn_first_product_xpath.click();
		productdetailpage.btn_add_cart_id.click();
		productdetailpage.txt_number_of_product_xpath.isDisplayed();
		productdetailpage.btn_increase_xpath.isDisplayed();
		productdetailpage.btn_decrease_xpath.isDisplayed();
			
		
	}
	
	@Test
	public void decrease_product() {
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
		productdetailpage.btn_decrease_xpath.click();
		productdetailpage.txt_number_of_products_xpath.isDisplayed();
		productdetailpage.btn_increase_xpath.isDisplayed();
		productdetailpage.btn_decrease_xpath.isDisplayed();
			
		
	}
	@Test
	public void favorites_add_product() {
		MobileElement btn_enter_xpath= (MobileElement) driver.findElementByXPath("//android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView[2]");
		btn_enter_xpath.click();
		promotionscreenpage.enter();
		
		MobileElement txt_dont_allow_permission_xpath =(MobileElement) driver.findElementByXPath("//*[@text=\"Konum iznini daha sonra vermek istiyorum\"]");
						
		txt_dont_allow_permission_xpath.click();
		
		homepage.delivery_select();
		homepage.btn_products_id.click();
		homepage.btn_snack_xpath.click();
		
		productdetailpage.btn_first_product_xpath.click();
		productdetailpage.btn_add_to_favorites_xpath.click();
		productdetailpage.btn_sign_in_id.isDisplayed();
		
	}
	
	@Test
	public void search_result_filter() 
	{
		MobileElement btn_enter_xpath= (MobileElement) driver.findElementByXPath("//android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView[2]");
		btn_enter_xpath.click();
		promotionscreenpage.enter();
		
		MobileElement txt_dont_allow_permission_xpath =(MobileElement) driver.findElementByXPath("//*[@text=\"Konum iznini daha sonra vermek istiyorum\"]");
						
		txt_dont_allow_permission_xpath.click();
		
		homepage.delivery_select();
		homepage.btn_products_id.click();
		homepage.btn_snack_xpath.click();
		
		productdetailpage.btn_filters_xpath.click();
		productdetailpage.btn_filter_categories_xpath.click();
		productdetailpage.chckbox_chocolate_xpath.click();
		productdetailpage.btn_apply_xpath.click();
		
		String filter_txt = productdetailpage.txt_selected_filter_id.getText();
		if(filter_txt == "Çikolata" && productdetailpage.btn_tick_id.isDisplayed())
		{
			productdetailpage.txt_view_products_id.click();
			Assert.assertTrue(true);
		}
	}

}
