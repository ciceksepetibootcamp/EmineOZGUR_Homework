package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.*;

public class First {
	
	WebDriver driver;
	
	WebElement hotelorlocation= driver.findElement(By.id("input-auto-complete"));
	WebElement firstchoise = driver.findElement(By.id("react-autowhatever-1--item-0"));
	WebElement search_button = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[3]/div[2]/div/div[1]/div/form/div[3]/button"));
	WebElement check_in= driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[3]/div[2]/div/div[1]/div/form/fieldset/div/div[1]/button"));
	WebElement checkout = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[3]/div[2]/div/div[1]/div/form/fieldset/div/div[2]/button"));
	WebElement hotel_detail_btn= driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[3]/section/div/ol/li[1]/section/article/div[2]/div[1]/button/span[2]"));
	WebElement hotel_information = driver.findElement(By.id("tabs-126-tab-1"));
	WebElement filters = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[2]/div[1]/div/div/div[5]/div/button/span"));
	WebElement hotel_score= driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[2]/div[1]/div/div/div[2]/div/button/span/span[2]"));
	WebElement ok_button = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[2]/div[1]/div/div/div[2]/div/button"));
	WebElement guest_rating = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[2]/div[2]/div/div/div[3]/div/button"));
	
	@Given("^Kullanici https://www\\.trivago\\.com\\.tr/ sitesine gider\\.$")
	public void kullanici_https_www_trivago_com_tr_sitesine_gider() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pc\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.trivago.com.tr/");
		
	}

	@When("^Otel adi: \"([^\"]*)\" veya lokasyon: \"([^\"]*)\" yazilir\\.$")
	public void otel_adi_veya_lokasyon_yazilir(String arg1, String arg2) throws Exception {
		 driver.findElement(By.id("input-auto-complete")).click();
		 hotelorlocation.click();
		 hotelorlocation.sendKeys(arg1);
	}

	@When("^Listelenen seceneklerden ilki tiklanir\\.$")
	public void listelenen_seceneklerden_ilki_tiklanir() throws Exception {
		firstchoise.click();
	}

	@When("^Giris tarihi: \"([^\"]*)\" ve Cikis tarihi: \"([^\"]*)\" secilir\\.$")
	public void giris_tarihi_ve_Cikis_tarihi_secilir(String arg1, String arg2) throws Exception {
		check_in.click();
		check_in.sendKeys(arg1);
		checkout.click();
		checkout.sendKeys(arg2);
	}

	@When("^ve Arama butonuna basilir\\.$")
	public void ve_Arama_butonuna_basilir() throws Exception {
		search_button.click();
	}

	@Then("^Yazilan \"([^\"]*)\" veya \"([^\"]*)\" a gore otellerin listelendigi gorulur\\.$")
	public void yazilan_veya_a_gore_otellerin_listelendigi_gorulur(String arg1, String arg2) throws Exception {
		String location_data = hotelorlocation.getText();
		if(location_data==arg1) 
		{
			System.out.println("Basarili");
		}
		
	}

	@When("^Otel turlerinden Yildiz: \"([^\"]*)\" secilir\\.$")
	public void otel_turlerinden_Yildiz_secilir(String arg1) throws Exception {
		filters.click();
		hotel_score.click();
				
	}

	@When("^Tamama tiklandiginda$")
	public void tamama_tiklandiginda() throws Exception {
		ok_button.click();
	}

	@Then("^Yildiz: \"([^\"]*)\" li otellerin listelendigi gorulur\\.$")
	public void yildiz_li_otellerin_listelendigi_gorulur(String arg1) throws Exception {
		 driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[2]/div[2]/div/div/div[5]/div/button/span/span[2]")).click();
	}

	@When("^Misafir puani: \"([^\"]*)\" secildiginde$")
	public void misafir_puani_secildiginde(String arg1) throws Exception {
		guest_rating.click();
	}

	@Then("^Misafir puani: \"([^\"]*)\" na gore sonuclarin geldigi gorulur\\.$")
	public void misafir_puani_na_gore_sonuclarin_geldigi_gorulur(String arg1) throws Exception {
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[2]/div[2]")).sendKeys(arg1);
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[2]/div[2]")).isDisplayed();
		
	}

	@When("^Fiyat/gece bari sola kaydirilip herhangi bir \"([^\"]*)\" belirlendiginde$")
	public void fiyat_gece_bari_sola_kaydirilip_herhangi_bir_belirlendiginde(String arg1) throws Exception {
		//driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[2]/div[2]/div/div/div[1]/div/div/div[2]/div")).click();
		//Ayrýca kontrol için incelenecektir.
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[2]/div[2]/div/div/div[1]/div/div/div[1]/strong[2]")).sendKeys(arg1);
		WebElement a1= driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[2]/div[2]/div/div/div[1]/div/div/div[1]/strong[2]"));
		WebElement a2 = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[3]/section/div/ol/li[1]/section/article/div[2]/div[2]/div/div[1]/div[2]/div[1]/div/p"));
		if(a1.getText() == a2.getText()) 
		{
			System.out.println("Basarili");
		}
	}

	@Then("^Belirlenen fiyattan daha dusuk otellerin listelendigi gorulur\\.$")
	public void belirlenen_fiyattan_daha_dusuk_otellerin_listelendigi_gorulur() throws Exception {
		
		 System.out.println("Basarili");
	}

	@When("^En dusuk fiyatimiza basildiginda ucretin digerlerine gore dusuk oldugu gorulur\\.$")
	public void en_dusuk_fiyatimiza_basildiginda_ucretin_digerlerine_gore_dusuk_oldugu_gorulur() throws Exception {
		 driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[3]/section/div/ol/li[1]/section/article/div[2]/div[2]/div[2]/button[2]/span[1]")).click();
		 
		 WebElement a=driver.findElement(By.xpath("//*[@id=\"tabs-635-panel-4\"]/div/section/div/div/div/div/ol/li[1]/div/aside/span/span/span[1]"));
		 WebElement b=driver.findElement(By.xpath("//*[@id=\"tabs-635-panel-4\"]/div/section/div/div/div/div/ol/li[3]/div/aside/span/span/span[1]"));
		 
		 if(a.getText() == b.getText()) 
		 {
			 System.out.println("Basarili");	 
		 }
		 else 
		 {
			 System.out.println("Basarisiz");
		 }
	}



	}

