Feature:US1006 yanlis bilgilerle sitye giris yapilamaz

  Scenario: TC09 yanlis password ile giris yapilamaz
    Given kullanici "hmcUrl" anasayfasinda
    Then Log in yazisina tiklar
    And gecerli username girer
    And gecersiz password girer
    And Login butonuna basar
    Then sayfaya giris yapilamadigini test eder
    And sayfayi kapatir

  Scenario: TC10 yanlis username ile giris yapilamaz
    Given kullanici "hmcUrl" anasayfasinda
    Then Log in yazisina tiklar
    And gecersiz username girer
    And gecerli password girer
    And Login butonuna basar
    Then sayfaya giris yapilamadigini test eder
    And sayfayi kapatir

  Scenario: TC11 yanlis username ve password ile giris yapilamaz
    Given kullanici "hmcUrl" anasayfasinda
    Then Log in yazisina tiklar
    And gecersiz username girer
    And gecersiz password girer
    And Login butonuna basar
    Then sayfaya giris yapilamadigini test eder
    And sayfayi kapatir