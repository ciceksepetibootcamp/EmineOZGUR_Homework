package Pages;

import org.openqa.selenium.support.PageFactory;

import Locators.cartLocator;
import Locators.product_detailLocator;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class cartPage {

	public cartPage(AppiumDriver<MobileElement> driver)
	{
		
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);	
		
	}
	
	@AndroidFindBy(id=cartLocator.btn_cart_id)
	public MobileElement btn_cart_id;
	
	@AndroidFindBy(id=cartLocator.btn_delete_cart_id)
	public MobileElement btn_delete_cart_id;
	
	@AndroidFindBy(id=cartLocator.cb_selection_for_deletion_id)
	public MobileElement cb_selection_for_deletion_id;
		
	@AndroidFindBy(id=cartLocator.txt_accept_delete_id)
	public MobileElement txt_accept_delete_id;
	
	@AndroidFindBy(xpath=cartLocator.txt_control_empty_cart_xpath)
	public MobileElement txt_control_empty_cart_xpath;
	
	@AndroidFindBy(id=cartLocator.txt_popup_id)
	public MobileElement txt_popup_id;
	
	@AndroidFindBy(id=cartLocator.btn_delete_product_id)
	public MobileElement btn_delete_product_id;
	
	public void delete_product()
	{		
		btn_delete_product_id.click();
		txt_accept_delete_id.click();
	}
}
