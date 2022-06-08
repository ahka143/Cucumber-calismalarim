Feature: US1004 kullanici parametre ile Configuratin file'i kullanabilmeli
  @config
  Scenario: TC07 configuration properties dosyasindan parametre kullanimi

    Given kullanici "techproUrl" anasayfasinda
    Then 2 saniye bekler
    And url'in "tech" icerdigini test eder
    Then sayfayi kapatir