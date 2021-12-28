package Pages;

import org.openqa.selenium.support.PageFactory;

import Locators.promotionscreenLocator;
import Tests.BaseTest;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import Locators.homepageLocator;

public class homePage extends BaseTest {
	
	public homePage(AppiumDriver<MobileElement> driver)
	{
		
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		
		
	}
	
	@AndroidFindBy(id=homepageLocator.txtfield_searchbar_id)
	public MobileElement txtfield_searchbar_id;
	
	@AndroidFindBy(id=homepageLocator.drpdownlst_method_of_delivery_id)
	public MobileElement drpdownlst_method_of_delivery_id;
	
	@AndroidFindBy(id=homepageLocator.btn_close_btn_id)
	public MobileElement btn_close_btn_id;
		
	@AndroidFindBy(xpath=homepageLocator.txt_home_delivery_xpath)
	public MobileElement txt_home_delivery_xpath;
	
	@AndroidFindBy(id=homepageLocator.btn_products_id)
	public MobileElement btn_products_id;
	
	@AndroidFindBy(id=homepageLocator.btn_cart_id)
	public MobileElement btn_cart_id;
		
	@AndroidFindBy(id=homepageLocator.btn_homepage_id)
	public MobileElement btn_homepage_id;
	
	@AndroidFindBy(xpath=homepageLocator.btn_search_xpath)
	public MobileElement btn_search_xpath;
	
	@AndroidFindBy(xpath=homepageLocator.scrollview_container_xpath)
	public MobileElement scrollview_container_xpath;
	
	@AndroidFindBy(id=homepageLocator.btn_searchtxt_input_id)
	public MobileElement btn_searchtxt_input_id;
	
	@AndroidFindBy(id=homepageLocator.btn_clear_txt_id)
	public MobileElement btn_clear_txt_id;
		
	@AndroidFindBy(xpath=homepageLocator.btn_snack_xpath)
	public MobileElement btn_snack_xpath;
	
	@AndroidFindBy(id=homepageLocator.btn_delivery_time_id)
	public MobileElement btn_delivery_time_id;
	
	@AndroidFindBy(xpath=homepageLocator.btn_select_delivery_time_xpath)
	public MobileElement btn_select_delivery_time_xpath;
	
	@AndroidFindBy(xpath=homepageLocator.txt_country_xpath)
	public MobileElement txt_country_xpath;
	
	@AndroidFindBy(xpath=homepageLocator.txt_district_xpath)
	public MobileElement txt_district_xpath;
	
	@AndroidFindBy(xpath=homepageLocator.txt_street_xpath)
	public MobileElement txt_street_xpath;
	
	public void delivery_select() 
	{
		
		txt_home_delivery_xpath.click();
		txt_country_xpath.click();
		txt_district_xpath.click();
		txt_street_xpath.click();	
	}

}
