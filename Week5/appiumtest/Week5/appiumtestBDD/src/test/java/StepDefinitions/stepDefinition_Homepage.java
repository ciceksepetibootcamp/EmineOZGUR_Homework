package StepDefinitions;

import org.openqa.selenium.Keys;

import Locators.homepageLocator;
import Pages.homePage;
import Pages.promotionscreenPage;
import Tests.BaseTest;
import io.appium.java_client.MobileElement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefinition_Homepage extends BaseTest{
	
	promotionscreenPage promotionscreenpage =new promotionscreenPage(driver);
	homePage homepage = new homePage(driver);
	
	@Given("Uygulamayi ac.")
	public void uygulamayi_ac() {
		MobileElement btn_enter_xpath= (MobileElement) driver.findElementByXPath("//android.widget.FrameLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView[2]");
		btn_enter_xpath.click();
		promotionscreenpage.enter();
		
		MobileElement txt_dont_allow_permission_xpath =(MobileElement) driver.findElementByXPath("//*[@text=\"Konum iznini daha sonra vermek istiyorum\"]");
						
		txt_dont_allow_permission_xpath.click();
	}

	@When("Searchbara tıklanır.")
	public void searchbara_tıklanır() {
		homepage.txtfield_searchbar_id.click();
	}

	@When("Herhangi bir ürün adı yazılır.")
	public void herhangi_bir_ürün_adı_yazılır() {
		homepage.btn_searchtxt_input_id.sendKeys("Çikolata");
	}

	@When("Search ikonuna tıklanır.")
	public void search_ikonuna_tıklanır() {
		driver.getKeyboard().pressKey(Keys.ENTER);	
	}

	@Then("Aratilan kelimeyle ilgili urunlerin listelendigi gorulur.")
	public void aratilan_kelimeyle_ilgili_urunlerin_listelendigi_gorulur() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Teslimat Bölgesi Seçine tiklanir.")
	public void teslimat_bölgesi_seçine_tiklanir() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Adresime Gelsine basilir.")
	public void adresime_gelsine_basilir() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Istanbul seçilir.")
	public void ıstanbul_seçilir() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Ilk ilçeye tiklanir.")
	public void ılk_ilçeye_tiklanir() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Ilk mahalleye tiklanir.")
	public void ılk_mahalleye_tiklanir() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Teslimat adresi kisminda secilen ilce ve mahallenin adi gorulur.")
	public void teslimat_adresi_kisminda_secilen_ilce_ve_mahallenin_adi_gorulur() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	
}
