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
import StepDefinitions.stepDefinition_Homepage;


public class homepageTest extends BaseTest{
	
	promotionscreenPage promotionscreenpage =new promotionscreenPage(driver);
	
	homePage homepage =new homePage(driver);
	stepDefinition_Homepage stapeDefinition_homepage= new stepDefinition_Homepage();
	
	@Order(1)
	@Test
	public void search_product() {
	
		stapeDefinition_homepage.uygulamayi_ac();
		stapeDefinition_homepage.searchbara_tıklanır();
		stapeDefinition_homepage.herhangi_bir_ürün_adı_yazılır();
		stapeDefinition_homepage.search_ikonuna_tıklanır();
		
	}
	
	@Order(2)
	@Test
	public void delivery_to_address_select()
	{
		stapeDefinition_homepage.uygulamayi_ac();
		MobileElement btn_delivery_time_id =(MobileElement) driver.findElementById("com.inomera.sm:id/deliveryPreferenceConstraint");
		btn_delivery_time_id.click();
		
		homepage.delivery_select();	
		
		String town = homepage.txt_control_town_id.getText();
		String region = homepage.txt_control_region_id.getText();
		
		Assert.assertEquals("Bakırköy", town);
		Assert.assertEquals("Cevizlik Mh.", region);
	}
	

}
