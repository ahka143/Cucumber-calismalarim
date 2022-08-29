@wip
Feature: US1002 Kullanici ortak adimlari background ile calisir

  Background: ortak adim
    Given kullanici amazon anasayfasinda
@sirali
    Scenario: TC04 amazon nutella arama
      And kullanici Nutella icin arama yapar
      Then  sonuclarin Nutella icerdigini test eder
      And sayfayi kapatir
@pr2
      Scenario: TC05 amazon java arama
        And kullanici Java icin arama yapar
        Then sonuclarin Java icerdigini test eder
        And sayfayi kapatir
