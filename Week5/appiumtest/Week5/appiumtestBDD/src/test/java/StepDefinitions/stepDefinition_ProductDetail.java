package StepDefinitions;

import Tests.BaseTest;
import io.appium.java_client.MobileElement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;

import Pages.cartPage;
import Pages.homePage;
import Pages.productdetailPage;
import Pages.promotionscreenPage;
public class stepDefinition_ProductDetail extends BaseTest{
	
	 	homePage homepage =new homePage(driver);
		
		productdetailPage productdetailpage = new productdetailPage(driver);
		
		promotionscreenPage promotionscreenpage =new promotionscreenPage(driver);
		cartPage cartpage = new cartPage(driver);
	
		
		@Given("App acilir.")
		public void app_acilir() {
			MobileElement btn_enter_xpath= (MobileElement) driver.findElementByXPath("//android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView[2]");
			btn_enter_xpath.click();
			promotionscreenpage.enter();
			
			MobileElement txt_dont_allow_permission_xpath =(MobileElement) driver.findElementByXPath("//*[@text=\"Konum iznini daha sonra vermek istiyorum\"]");
							
			txt_dont_allow_permission_xpath.click();
		}

		@When("Categories tiklanir.")
		public void categories_tiklanir() {
			homepage.delivery_select();
			homepage.btn_products_id.click();
		}

		@When("Atistirmaliklar kategorisine tiklanir.")
		public void atistirmaliklar_kategorisine_tiklanir() {
			homepage.btn_snack_xpath.click();
		}

		@When("Gelen sonuclardan ilk urune tiklanir.")
		public void gelen_sonuclardan_ilk_urune_tiklanir() {
			productdetailpage.btn_first_product_xpath.click();
		}

		@Then("+, - ikonlari gorulur.")
		public void ikonlari_gorulur() {
			productdetailpage.btn_increase_xpath.isDisplayed();
			productdetailpage.btn_decrease_xpath.isDisplayed();
		}

		@When("+ ikonuna basilir.")
		public void ikonuna_basilir() {
			productdetailpage.btn_decrease_xpath.click();
		}

		@Then("Adet sayisinin arttigi gorulur.")
		public void adet_sayisinin_arttigi_gorulur() {
			productdetailpage.txt_number_of_products_xpath.isDisplayed();
		}

		@When("Kalp ikonuna basilir.")
		public void kalp_ikonuna_basilir() {
			productdetailpage.btn_add_to_favorites_xpath.click();
		}

		@Then("Uye Ol ve Giris Yap butonlari gorulur.")
		public void uye_ol_ve_giris_yap_butonlari_gorulur() {
			productdetailpage.btn_sign_in_id.isDisplayed();
		}

		@When("Filtreleye basilir.")
		public void filtreleye_basilir() {
			productdetailpage.btn_filters_xpath.click();
		}

		@When("Cikolataya tiklanir.")
		public void cikolataya_tiklanir() {
			productdetailpage.btn_filter_categories_xpath.click();
			productdetailpage.chckbox_chocolate_xpath.click();
		}

		@When("Uygulaya basilir.")
		public void uygulaya_basilir() {
			productdetailpage.btn_apply_xpath.click();
		}
		
		@When("Gelen ilk urune tiklanir.")
		public void gelen_ilk_urune_tiklanir() {
			productdetailpage.btn_first_product_xpath.click();
		}

		@When("Urunleri Goruntuleye basilir.")
		public void urunleri_goruntuleye_basilir() {
			productdetailpage.txt_view_products_id.click();
		}

		@Then("Kategorilerin altinda cikolata yazdigi gorulur.")
		public void kategorilerin_altinda_cikolata_yazdigi_gorulur() {
			String filter_txt = productdetailpage.txt_selected_filter_id.getText();
			
			if(filter_txt == "Çikolata" && productdetailpage.btn_tick_id.isDisplayed())
			{
				productdetailpage.txt_view_products_id.click();
				Assert.assertTrue(true);
			}
		}


		@When("Sepete Ekle butonuna basilir.")
		public void sepete_ekle_butonuna_basilir() {
			productdetailpage.btn_add_cart_id.click();
		}

}
