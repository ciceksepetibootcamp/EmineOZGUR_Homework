package Tests;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import Pages.homePage;
import Pages.productdetailPage;
import Pages.promotionscreenPage;
import io.appium.java_client.MobileElement;
import StepDefinitions.stepDefinition_ProductDetail;

public class productdetailTest extends BaseTest {
	
	promotionscreenPage promotionscreenpage =new promotionscreenPage(driver);
	
	homePage homepage =new homePage(driver);
	
	productdetailPage productdetailpage = new productdetailPage(driver);
	
	stepDefinition_ProductDetail stepDefinition_productdetail= new stepDefinition_ProductDetail();

	@Test
	public void add_product() {
		
		stepDefinition_productdetail.app_acilir();
		stepDefinition_productdetail.categories_tiklanir();
		stepDefinition_productdetail.atistirmaliklar_kategorisine_tiklanir();
		stepDefinition_productdetail.gelen_ilk_urune_tiklanir();
		stepDefinition_productdetail.sepete_ekle_butonuna_basilir();
		stepDefinition_productdetail.ikonlari_gorulur();
		
		
	}
	
	@Test
	public void decrease_product() {
		stepDefinition_productdetail.app_acilir();
		
		homepage.delivery_select();
		stepDefinition_productdetail.categories_tiklanir();
		stepDefinition_productdetail.atistirmaliklar_kategorisine_tiklanir();
		stepDefinition_productdetail.gelen_ilk_urune_tiklanir();
		stepDefinition_productdetail.sepete_ekle_butonuna_basilir();
		stepDefinition_productdetail.ikonuna_basilir();
		stepDefinition_productdetail.adet_sayisinin_arttigi_gorulur();
		/*
		homepage.btn_products_id.click();
		homepage.btn_snack_xpath.click();
		
		productdetailpage.btn_first_product_xpath.click();
		productdetailpage.btn_add_cart_id.click();
		productdetailpage.btn_decrease_xpath.click();
		productdetailpage.txt_number_of_products_xpath.isDisplayed();
		productdetailpage.btn_increase_xpath.isDisplayed();
		productdetailpage.btn_decrease_xpath.isDisplayed();
			*/
		
	}
	@Test
	public void favorites_add_product() {
		
		stepDefinition_productdetail.app_acilir();
				
		homepage.delivery_select();
		stepDefinition_productdetail.categories_tiklanir();
		stepDefinition_productdetail.atistirmaliklar_kategorisine_tiklanir();
		stepDefinition_productdetail.gelen_ilk_urune_tiklanir();
		stepDefinition_productdetail.sepete_ekle_butonuna_basilir();
		stepDefinition_productdetail.uye_ol_ve_giris_yap_butonlari_gorulur();
	
	}
	
	@Test
	public void search_result_filter() 
	{
		stepDefinition_productdetail.app_acilir();
		
		homepage.delivery_select();
		stepDefinition_productdetail.categories_tiklanir();
		stepDefinition_productdetail.atistirmaliklar_kategorisine_tiklanir();
		stepDefinition_productdetail.filtreleye_basilir();		
		productdetailpage.btn_filter_categories_xpath.click();
		stepDefinition_productdetail.cikolataya_tiklanir();
		stepDefinition_productdetail.uygulaya_basilir();
		
		stepDefinition_productdetail.kategorilerin_altinda_cikolata_yazdigi_gorulur();
	}

}
