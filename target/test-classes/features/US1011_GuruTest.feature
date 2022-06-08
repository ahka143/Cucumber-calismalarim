Feature: US1011 Web tablosundaki istenen su yazdirma

  Scenario:TC16 kullanici sutun basligi ile liste alabilmeli
  http://demo.guru99.com/test/web-table-element.php sayfasina gidelim

    Given kullanici "guruUrl" anasayfasinda
    And "Prev Close (Rs)", sutunundaki tum degerleri yazdirir
    Then sayfayi kapatir