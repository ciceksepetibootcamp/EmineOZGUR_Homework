# EmineOZGUR_Homework

## Çiçeksepeti_Test_Otomasyon_Bootcamp_Hafta1_Ödev1

:closed_lock_with_key: https://www.ciceksepeti.com/ için yazdığım test senaryolarının bulunduğu e-tablonun linki -> https://docs.google.com/spreadsheets/d/1--F6OhDgr6vDXKPVJyf1q_lN8IQvFLUmYNhzBSoKjV8/edit?usp=sharing

## Çiçeksepeti_Test_Otomasyon_Bootcamp_Hafta1_Ödev2

:key:  Bu ödevde 2 class ve her class içerisinde ikişer senaryo bulunmaktadır.

Kodlanan Test Senaryolarının Noları: CSCSY1, CSCSY3, CSC1 ve CSC2

Ödev1 kapsamında teslim ettiğim e-tabloda senarolara ulaşabilirsiniz!!!

IDE olarak Eclipse'i kullandım.
https://www.selenium.dev/downloads/ sayfasında Selenium Server (Grid), Selenium Clients and WebDriver(Java) ve Chromedriver'ı indirdim. İndirdiğim .jar dosyalarını Java projeme dahil ettim.

CSC1 -> Çiçek Kategorisi - Sipariş Saati Seçme :

>- https://www.ciceksepeti.com/'a girilir.
>- "Çiçek" kategorisine tıklanır.
>- Gelen ürünlerden herhangi birine tıklanır.
>- Teslimat tarihi seçilir.
>- Teslimat saati seçilir.
>- "Sipariş Ver"'e basılır.
- Status: PASSED
- Beklenen Durum: *Seçilen teslimat tarihi ve saatinin sepette doğru görülmesi


CSC2 -> Çiçek Kategorisi - Ürün Ekleme :

>- https://www.ciceksepeti.com/'a girilir.
>- "Çiçek" kategorisine tıklanır.
>- Gelen ürünlerden herhangi birine tıklanır.
>- "Sipariş Ver"'e tıklanır.
- Status: FAILED
- Beklenen Durum: *Sepetime yönlendirilmeli
- Gerçekleşen Durum: "Kullanıcı Girişi" sayfasına yönlendirildiği gözlemlenir.

CSCSY1 -> Çiçeksepeti'nde Satış Yapma Sayfası - Hemen Başvuru Yapma :

>- https://www.ciceksepeti.com/'a girilir.
>- Anasayfada sağ üstte bulunan "Çiçeksepeti'nde Satış Yap"'a basılır.
>- Çıkan popup kapatılır.
>- "Hemen Başvur"'a tıklanır. 
>- Çıkan popup kapatılır.
- Status: PASSED
- Beklenen Sonuç: *Firma başvuru sayfasına yönlendirildiğinin görülmesi  *"Devam Et" butonun görülmesi gerekir.
                
              
CSCSY1 -> Çiçeksepeti'nde Satış Yapma Sayfası - "Sıkça Sorulan Sorular" sayfasına yönlendirme :

>- https://www.ciceksepeti.com/'a girilir.
>- Anasayfada sağ üstte bulunan "Çiçeksepeti'nde Satış Yap"'a basılır.
>- Çıkan popup kapatılır.
>- "Hemen Başvur"'a tıklanır. 
>- Çıkan popup kapatılır.
>- "Sıkça Sorulan Sorular" butonuna basılır.
- Status: PASSED
- Beklenen Sonuç: *"Sıkça Sorulan Sorular" sayfasına yönlendirildiğinin görülmesi
