Feature: US1003 kullanici parameter kullanarak arama yapabilmeli
  @parametre
  Scenario: TC06 kullanici parametre ile amazonda arama yapabilmeli
    Given kullanici amazon anasayfasinda
    And kullanici "java" icin arama yapar
    And sonuclarin "hava" icerdigini test eder
    Then sayfayi kapatir