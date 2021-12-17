import selenium.webdriver.chrome as chrome
from selenium import webdriver
class Locators():

    driver_executable_path = "C:/Users/Pc/Downloads/chromedriver_win32/chromedriver.exe"

    #Xpathi lınan elementler
    btn_sign_in_xpath= "//li[@class=\"register\"]//span"
    btn_login_xpath= "//li[@class=\"login\"]//span"
    btn_logo_xpath= "//*[@class=\"logo\"]"
    btn_cart_xpath = "//span[@class=\"b-text\"]"
    btn_sign_in_btn_xpath = "(//button[@type=\"submit\"])[1]"
    btn_forgot_pass_xpath= "//button[@data-test-id=\"51\"]"
    btn_complete_subscription_xpath = "//button[@data-test-id=\"66\"]"
    img_first_product_xpath = "(//*[@class=\"imgDepot col-1\"])[1]"
    btn_add_to_cart_xpath = "//*[@class=\"btn-ext btn-red add-basket-product js-addCart\"]"
    txt_verify_add_to_basket_class_name = "added-notification"
    txt_filter_type_of_product_xpath = "(//*[@class=\"form-control brand-input search-filter-input js-search-in-filter-items\"])[1]"
    btn_filter_mini_search_xpath = "(//*[@class=\"btn btn-red mini-search\"])[2]"
    lstbx_orderby_xpath = "//*[@class=\"slide-open\"]"
    btn_thecheapest_products_xpath = "(//*[@class=\"product-order js-sort\"])[2]"
    lbl_general_content_xpath = "//*[@class=\"contentArea\"]"
    btn_filter_xpath = "//*[@class=\"btn btn-red filter-all fixed\"]"
    btn_navbar_menu_first_choosen = "(//*[@class=\"menu-category navLink\"])[1]"
    txt_min_TL_xpath = "//*[@placeholder=\"min TL\"]"
    txt_max_TL_xpath = "//*[@placeholder=\"max TL\"]"
    btn_delete_choosens_xpath = "//*[@class=\"custom-link delete-chosens js-remove-filter\"]"
    
    #idsi alınan elementler 
    txt_searchbar_id= "pw-search-input"
    btn_search_button_id = "pw-search-submit"
    txt_customeremail_id = "customerEmail"
    txt_customer_pass = "customerPassword"

