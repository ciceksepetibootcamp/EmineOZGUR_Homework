from selenium import webdriver
import selenium.webdriver.chrome as chrome
import time
import unittest


#ModuleNotFoundError: No module named hatasını önlemek için

import Boyner.Locators.locators as Locators

class Tests(unittest.TestCase):

    @unittest.BaseTestSuite
    def setUpClass():
        driver = webdriver.Chrome(executable_path= Locators.Locators.driver_executable_path)
        driver.maximize_window()     
        driver.get("https://www.boyner.com.tr/")
    
    @unittest.TestCase
    def select_product(): 
        driver.find_element_by_id(Locators.Locators.txt_searchbar_id).click()
        driver.find_element_by_id(Locators.Locators.txt_searchbar_id).send_keys("kalem")
        driver.find_element_by_id(Locators.Locators.btn_search_button_id).click()
        driver.find_element_by_xpath(Locators.Locators.img_first_product_xpath).click()
        driver.find_element_by_xpath(Locators.Locators.btn_add_to_cart_xpath).click()      
        #txt = driver.find_element_by_class_name(Locators.Locators.txt_verify_add_to_basket_class_name).text
        driver.find_element_by_class_name(Locators.Locators.txt_verify_add_to_basket_class_name).is_displayed()
        print("Test Basarili")


    
    @unittest.TestCase
    def Search():
         driver.find_element_by_id(Locators.Locators.txt_searchbar_id).click()
         driver.find_element_by_id(Locators.Locators.txt_searchbar_id).send_keys("kalem")
         driver.find_element_by_id(Locators.Locators.btn_search_button_id).click()
         print("Test Basarili")

    @unittest.TestCase
    def orderby():
        driver.find_element_by_id(Locators.Locators.txt_searchbar_id).click()
        driver.find_element_by_id(Locators.Locators.txt_searchbar_id).send_keys("kalem")
        driver.find_element_by_id(Locators.Locators.btn_search_button_id).click()
        driver.find_element_by_xpath(Locators.Locators.lstbx_orderby_xpath).click()
        driver.find_element_by_xpath(Locators.Locators.btn_thecheapest_products_xpath).click()
        print("Test Basarili")
   


if __name__ == '__main__':
    unittest.main()
