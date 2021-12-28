package StepDefinitions;

import org.openqa.selenium.support.PageFactory;

import Pages.cartPage;
import Pages.homePage;
import Pages.productdetailPage;
import Pages.promotionscreenPage;
import Tests.BaseTest;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import Pages.cartPage;

public class stepDefinition_Cart extends BaseTest{
	
   homePage homepage =new homePage(driver);
	
	productdetailPage productdetailpage = new productdetailPage(driver);
	
	promotionscreenPage promotionscreenpage =new promotionscreenPage(driver);
	cartPage cartpage = new cartPage(driver);
	@Given("Uygulama acilir.")
	public void uygulama_acilir()  {
	
		MobileElement btn_enter_xpath= (MobileElement) driver.findElementByXPath("//android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView[2]");
		btn_enter_xpath.click();
		promotionscreenpage.enter();
		
		MobileElement txt_dont_allow_permission_xpath =(MobileElement) driver.findElementByXPath("//*[@text=\"Konum iznini daha sonra vermek istiyorum\"]");
						
		txt_dont_allow_permission_xpath.click();
		
		
	
	}
	
	@When("Kategorilere tiklanir.")
	public void kategorilere_tiklanir() {
		homepage.delivery_select();
		homepage.btn_products_id.click();
		
	
	}

	@When("Atistirmalik kategorisine tiklanir.")
	public void atistirmalik_kategorisine_tiklanir() {
		homepage.btn_snack_xpath.click();
	}

	@When("Gelen sonuclardan ilk ürüne tiklanir.")
	public void gelen_sonuclardan_ilk_ürüne_tiklanir() {
		productdetailpage.btn_first_product_xpath.click();
	}

	@When("Sepete Ekleye basilir.")
	public void sepete_ekleye_basilir() {
		productdetailpage.btn_add_cart_id.click();
	}


	@When("Geri gidilir.")
	public void geri_gidilir() {
		productdetailpage.btn_back_xpath.click();
	}

	@When("Sepete gidilir.")
	public void sepete_gidilir() {
		cartpage.btn_cart_id.click();
		cartpage.txt_popup_id.click();
		cartpage.btn_cart_id.click();
	}

	@When("Urun azaltma ikonuna basilir.")
	public void urun_azaltma_ikonuna_basilir() {
		cartpage.btn_delete_product_id.click();
	}

	@When("Sile basilir.")
	public void sile_basilir() {
		cartpage.txt_accept_delete_id.click();
	}

	@Then("Sepetinde hic urun bulunmuyor.\" texti gorulmelidir.")
	public void sepetinde_hic_urun_bulunmuyor_texti_gorulmelidir() {
		cartpage.txt_control_empty_cart_xpath.isDisplayed();
	}


}
