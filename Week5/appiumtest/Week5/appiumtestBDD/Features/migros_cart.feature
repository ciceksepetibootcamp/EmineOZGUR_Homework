Feature: Migros Sepet Testleri

  Scenario Outline: Sepetten urun cikartma
    Given Uygulama acilir.
    When Kategorilere tiklanir.
    And Atistirmalik kategorisine tiklanir.
    And Gelen sonuclardan ilk ürüne tiklanir.
    And Sepete Ekleye basilir.
    And Geri gidilir.
    And Sepete gidilir.
    And Urun azaltma ikonuna basilir.
    And Sile basilir.
    Then Sepetinde hic urun bulunmuyor.
