package Pages;

import org.openqa.selenium.support.PageFactory;

import Locators.homepageLocator;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import Locators.product_detailLocator;
public class productdetailPage {
	
	
	public productdetailPage(AppiumDriver<MobileElement> driver)
	{
		
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);	
		
	}
	
	@AndroidFindBy(xpath=product_detailLocator.btn_filters_xpath)
	public MobileElement btn_filters_xpath;
	
	@AndroidFindBy(xpath=product_detailLocator.btn_filter_categories_xpath)
	public MobileElement btn_filter_categories_xpath;
	
	@AndroidFindBy(xpath=product_detailLocator.chckbox_chocolate_xpath)
	public MobileElement chckbox_chocolate_xpath;
		
	@AndroidFindBy(xpath=product_detailLocator.btn_apply_xpath)
	public MobileElement btn_apply_xpath;
	
	@AndroidFindBy(id=product_detailLocator.txt_selected_filter_id)
	public MobileElement txt_selected_filter_id;
	
	@AndroidFindBy(id=product_detailLocator.btn_tick_id)
	public MobileElement btn_tick_id;
		
	@AndroidFindBy(id=product_detailLocator.btn_clear_filter_id)
	public MobileElement btn_clear_filter_id;
	
	@AndroidFindBy(xpath=product_detailLocator.txt_next_step_selected_filter_xpath)
	public MobileElement txt_next_step_selected_filter_xpath;
	
	@AndroidFindBy(xpath=product_detailLocator.btn_product_view_xpath)
	public MobileElement btn_product_view_xpath;
	
	@AndroidFindBy(id=product_detailLocator.btn_order_id)
	public MobileElement btn_order_id;
	
	@AndroidFindBy(xpath=product_detailLocator.btn_first_product_xpath)
	public MobileElement btn_first_product_xpath;
		
	@AndroidFindBy(id=product_detailLocator.btn_add_cart_id)
	public MobileElement btn_add_cart_id;
	
	@AndroidFindBy(xpath=product_detailLocator.btn_increase_xpath)
	public MobileElement btn_increase_xpath;
	
	@AndroidFindBy(xpath=product_detailLocator.btn_decrease_xpath)
	public MobileElement btn_decrease_xpath;
	
	@AndroidFindBy(xpath=product_detailLocator.btn_back_xpath)
	public MobileElement btn_back_xpath;
	
	@AndroidFindBy(xpath=product_detailLocator.btn_add_to_favorites_xpath)
	public MobileElement btn_add_to_favorites_xpath;
	
	@AndroidFindBy(id=product_detailLocator.btn_sign_in_id)
	public MobileElement btn_sign_in_id;
	
	@AndroidFindBy(xpath=product_detailLocator.txt_number_of_products_xpath)
	public MobileElement txt_number_of_products_xpath;
	
	@AndroidFindBy(xpath=product_detailLocator.txt_number_of_product_xpath)
	public MobileElement txt_number_of_product_xpath;

	@AndroidFindBy(id=product_detailLocator.txt_view_products_id)
	public MobileElement txt_view_products_id;
	
}
