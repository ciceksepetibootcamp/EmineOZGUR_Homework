Feature: Trivago Test Senaryolari

  Scenario Outline: Konaklama Yeri Arama
    Given Kullanici https://www.trivago.com.tr/ sitesine gider.
    When Otel adi: "<Otel adi>" veya lokasyon: "<lokasyon>" yazilir.
    And Listelenen seceneklerden ilki tiklanir.
    And Giris tarihi: "<Giris tarihi>" ve Cikis tarihi: "<Cikis tarihi>" secilir.
    And ve Arama butonuna basilir.
    Then Yazilan "<Otel adi>" veya "<lokasyon>" a gore otellerin listelendigi gorulur.

    Examples: 
      | Otel adi | lokasyon | Giris tarihi    | Cikis tarihi    |
      | otel1    | Ýstanbul | Cum, 25.02.2022 | Cmt, 26.02.2022 |
      | otel2    | Ýstanbul | Cum, 25.02.2022 | Cmt, 26.02.2022 |

  Scenario Outline: Arama Sonuclarinin Otel Tipi Filtreleme
    Given Kullanici https://www.trivago.com.tr/ sitesine gider.
    When Otel adi: "<Otel adi>" veya lokasyon: "<lokasyon>" yazilir.
    And Listelenen seceneklerden ilki tiklanir.
    And Giris tarihi: "<Giris tarihi>" ve Cikis tarihi: "<Cikis tarihi>" secilir.
    And ve Arama butonuna basilir.
    And Otel turlerinden Yildiz: "<yildiz>" secilir.
    And Tamama tiklandiginda
    Then Yildiz: "<yildiz>" li otellerin listelendigi gorulur.

    Examples: 
      | Otel adi | lokasyon | Giris tarihi    | Cikis tarihi    | yildiz |
      | otel1    | Ýstanbul | Cum, 25.02.2022 | Cmt, 26.02.2022 |      1 |
      | otel2    | Ýstanbul | Cum, 25.02.2022 | Cmt, 26.02.2022 |      2 |
      | otel1    | Ýstanbul | Cum, 25.02.2022 | Cmt, 26.02.2022 |      3 |
      | otel2    | Ýstanbul | Cum, 25.02.2022 | Cmt, 26.02.2022 |      4 |
      | otel1    | Tekirdað | Cum, 25.02.2022 | Cmt, 26.02.2022 |      5 |

  Scenario Outline: Arama Sonuclarinin Misafir Puani Filtreleme
    Given Kullanici https://www.trivago.com.tr/ sitesine gider.
    When Otel adi: "<Otel adi>" veya lokasyon: "<lokasyon>" yazilir.
    And Listelenen seceneklerden ilki tiklanir.
    And Giris tarihi: "<Giris tarihi>" ve Cikis tarihi: "<Cikis tarihi>" secilir.
    And ve Arama butonuna basilir.
    And Misafir puani: "<Misafir puani>" secildiginde
    Then Misafir puani: "<Misafir puani>" na gore sonuclarin geldigi gorulur.

    Examples: 
      | Otel adi | lokasyon | Giris tarihi    | Cikis tarihi    | Misafir puani |
      | otel1    | Tekirdað | Cum, 25.02.2022 | Cmt, 26.02.2022 | 8.5+          |
      | otel2    | Ýstanbul | Cum, 25.02.2022 | Cmt, 26.02.2022 | 8+            |
      | otel1    | Tekirdað | Cum, 25.02.2022 | Cmt, 26.02.2022 | 7.5+          |
      | otel2    | Ýstanbul | Cum, 25.02.2022 | Cmt, 26.02.2022 | 7+            |
      | otel1    | Tekirdað | Cum, 25.02.2022 | Cmt, 26.02.2022 |             0 |

  Scenario Outline: Arama Sonuclarinin Gecelik Fiyata Gore Filtreleme
    Given Kullanici https://www.trivago.com.tr/ sitesine gider.
    When Otel adi: "<Otel adi>" veya lokasyon: "<lokasyon>" yazilir.
    And Listelenen seceneklerden ilki tiklanir.
    And Giris tarihi: "<Giris tarihi>" ve Cikis tarihi: "<Cikis tarihi>" secilir.
    And ve Arama butonuna basilir.
    And Fiyat/gece bari sola kaydirilip herhangi bir "<fiyat>" belirlendiginde
    Then Belirlenen fiyattan daha dusuk otellerin listelendigi gorulur.

    Examples: 
      | Otel adi | lokasyon | Giris tarihi    | Cikis tarihi    | fiyat |
      | otel1    | Ýstanbul | Cum, 25.02.2022 | Cmt, 26.02.2022 |   781 |
      | otel2    | Tekirdað | Cum, 25.02.2022 | Cmt, 26.02.2022 |   781 |

  Scenario Outline: Arama Sonuclarinda En Dusuk Fiyatin Kontrolu
    Given Kullanici https://www.trivago.com.tr/ sitesine gider.
    When Otel adi: "<Otel adi>" veya lokasyon: "<lokasyon>" yazilir.
    And Listelenen seceneklerden ilki tiklanir.
    And Giris tarihi: "<Giris tarihi>" ve Cikis tarihi: "<Cikis tarihi>" secilir.
    And ve Arama butonuna basilir.
    And En dusuk fiyatimiza basildiginda ucretin digerlerine gore dusuk oldugu gorulur.

    Examples: 
      | Otel adi | lokasyon | Giris tarihi    | Cikis tarihi    |
      | otel1    | Tekirdað | Cum, 25.02.2022 | Cmt, 26.02.2022 |
      | otel2    | Ýstanbul | Cum, 25.02.2022 | Cmt, 26.02.2022 |
