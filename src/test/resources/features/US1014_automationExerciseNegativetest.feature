Feature: US1014 kullanici automationparactice sitesine @ isareti olamayan mail adresi girememeli
@test
  Scenario: TC01 kullanici automationparactice sitesine @ isareti olamayan mail adresi girememeli
    Given kullanici "automationUrl" anasayfasinda
    And user sign in linkine tiklar
    And email kutusuna @isareti olmayan email adresi yazar ve enter'a tiklar
    Then error mesajinin Invalid email address oldugunu dogrulayin