package Tests;

import static org.junit.Assert.*;

import org.junit.Test;

import Pages.cartPage;
import Pages.homePage;
import Pages.productdetailPage;
import Pages.promotionscreenPage;
import io.appium.java_client.MobileElement;
import StepDefinitions.stepDefinition_Cart;

public class cartTest extends BaseTest{

	//stepDefinition_Cart
	stepDefinition_Cart stepDefinition_cart= new stepDefinition_Cart();
	
	@Test
	public void delete_products() throws Exception {
		
		stepDefinition_cart.uygulama_acilir();
		stepDefinition_cart.kategorilere_tiklanir();
		stepDefinition_cart.atistirmalik_kategorisine_tiklanir();
		stepDefinition_cart.gelen_sonuclardan_ilk_ürüne_tiklanir();
		stepDefinition_cart.sepete_ekleye_basilir();
		stepDefinition_cart.geri_gidilir();
		stepDefinition_cart.sepete_gidilir();
		stepDefinition_cart.urun_azaltma_ikonuna_basilir();
		stepDefinition_cart.sile_basilir();
		stepDefinition_cart.sepetinde_hic_urun_bulunmuyor_texti_gorulmelidir();
		
		
	}

}
