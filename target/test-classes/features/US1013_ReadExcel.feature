Feature: US1013 kullanici excel bilgilerine ulasir

  @exel
  Scenario: TC18 kullanici excel bilgilerini kullanir

    Given kullanici excel dosyasini kullanilabilir hale getirir
    Then 1.satirdaki 2.hucreyi yazdirir
    And baskenti "Baku" olan ulke ismini yazdirir
    And Ulke sayisinin 190 oldugunu test eder
    And Fiziki olarak kullanilan satir sayisinin 191 oldugunu test eder
