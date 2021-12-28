Feature: Migros Urun Detay Testleri

  Scenario Outline: Sepete Urun Ekleme
    Given App acilir.
    When Categories tiklanir.
    And Atistirmaliklar kategorisine tiklanir.
    And Gelen ilk urune tiklanir.
    And Sepete Ekle butonuna basilir.
    Then +, - ikonlari gorulmeli

  Scenario Outline: Sepete ayni urunden birden fazla ekleme
    Given App acilir.
    When Categories tiklanir.
    And Atistirmaliklar kategorisine tiklanir.
    And Gelen ilk urune tiklanir.
    And Sepete Ekle butonuna basilir.
    And + ikonuna basilir.
    Then Adet sayisinin arttigi gorulur.

  Scenario Outline: Urunu Favorileme
    Given App acilir.
    When Categories tiklanir.
    And Atistirmaliklar kategorisine tiklanir.
    And Gelen ilk urune tiklanir.
    And Kalp ikonuna basilir.
    Then Uye Ol ve Giris Yap butonlari gorulur.

  Scenario Outline: Arama Sonuclarini Filtreleme (Category gore)
    Given App acilir.
    When Categories tiklanir.
    And Atistirmaliklar kategorisine tiklanir.
    And Filtreleye basilir.
    And Kategorilere tiklanir.
    And Cikolataya tiklanir.
    And Uygulaya basilir.
    And Urunleri Goruntuleye basilir.
    Then Kategorilerin altinda cikolata yazdigi gorulur.
