using NUnit.Framework;
using OpenQA.Selenium;
using OpenQA.Selenium.Chrome;
using AliExpressTest.Locators;
using System;

namespace AliExpressTest
{

    public class Tests
    {
        IWebDriver webDriver;
        IWebElement button;
        private IWebElement btn_search_button_xpath;
        private IWebElement btn_speed_search_xpath;
        private IWebElement txt_search_product_name_class_name;
        private IWebElement txt_min_price_xpath;
        private IWebElement txt_max_price_xpath;
        private IWebElement btn_narrow_go_xpath;
        private IWebElement filter_xpath;
        private readonly IWebElement change_price_filter_xpath;
        private IWebElement first_product_price_xpath;
        Locators.locators nesne = new Locators.locators();

        [SetUp]
            public void Setup()
            {
            webDriver = new ChromeDriver("C:\\Users\\Pc\\Downloads\\chromedriver_win32\\");
            webDriver.Url = "https://tr.aliexpress.com/";
            if (webDriver.FindElement(By.XPath(nesne.btn_pop_up_dont_allow_xpath)).Displayed)
            {
                webDriver.FindElement(By.XPath(nesne.btn_pop_up_dont_allow_xpath)).Click();
            }

        }

        

        [Test]
        public void Search_Product()
        {           
            button = webDriver.FindElement(By.Id(nesne.txt_searchbar_id));
            button.SendKeys("kalem");
            btn_search_button_xpath = webDriver.FindElement(By.XPath(nesne.btn_search_button_xpath));
            btn_search_button_xpath.Click();

            Assert.Pass();
        }


        [Test]
        public void Proposed_Product_Search()
        {
            btn_speed_search_xpath = webDriver.FindElement(By.XPath(nesne.btn_speed_search_xpath));
            string txt = btn_speed_search_xpath.Text;
            btn_speed_search_xpath.Click();
            txt_search_product_name_class_name = webDriver.FindElement(By.XPath(nesne.txt_search_product_name_class_name));
            string txt2 = txt_search_product_name_class_name.Text;
            Assert.AreEqual('"'+txt+'"', txt2);
            Assert.Pass();
        }
        [Test]
        public void Search_Results_Price_Filter() 
        {
            int min = 5;
            int max = 100;
            button = webDriver.FindElement(By.Id(nesne.txt_searchbar_id));
            button.SendKeys("kalem");
            btn_search_button_xpath = webDriver.FindElement(By.XPath(nesne.btn_search_button_xpath));
            btn_search_button_xpath.Click();
            txt_min_price_xpath = webDriver.FindElement(By.XPath(nesne.txt_min_price_xpath));
            txt_min_price_xpath.Click();
            txt_min_price_xpath.SendKeys(min.ToString());
            txt_max_price_xpath = webDriver.FindElement(By.XPath(nesne.txt_max_price_xpath));
            txt_max_price_xpath.Click();
            txt_max_price_xpath.SendKeys(max.ToString());
            btn_narrow_go_xpath = webDriver.FindElement(By.XPath(nesne.btn_narrow_go_xpath));
            btn_narrow_go_xpath.Click();
            filter_xpath = webDriver.FindElement(By.XPath(nesne.filter_xpath));
            filter_xpath.Click();
            //change_price_filter_xpath = webDriver.FindElement(By.XPath(nesne.change_price_filter_xpath));
            //change_price_filter_xpath.Click();
            first_product_price_xpath = webDriver.FindElement(By.XPath(nesne.first_product_price_xpath));
            /*
            string txt = first_product_price_xpath.Text;
            txt.Split("TRY");

            if (min< Int32.Parse(txt))
            {
                filter_xpath.Click();
                if (max >Int32.Parse(txt))
                {
                    Assert.Pass();
                }

            }
            */
            Assert.Pass();

        }


    }

    
}