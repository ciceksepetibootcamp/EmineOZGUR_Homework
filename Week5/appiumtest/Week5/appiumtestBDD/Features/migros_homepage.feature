Feature: Migros Anasayfa Testleri

  Scenario Outline: Urun Arama
    Given Uygulamayi ac.
    When Searchbara tıklanır.
    When Herhangi bir ürün adı yazılır.
    And Search ikonuna tıklanır.
    Then Aratilan kelimeyle ilgili urunlerin listelendigi gorulur.

  Scenario Outline: Teslimat Bolgesi Secme
    Given Uygulamayi ac.
    When Teslimat Bölgesi Seçine tiklanir.
    When Adresime Gelsine basilir.
    And Istanbul seçilir.
    And Ilk ilçeye tiklanir.
    And Ilk mahalleye tiklanir.
    Then Teslimat adresi kisminda secilen ilce ve mahallenin adi gorulur.
