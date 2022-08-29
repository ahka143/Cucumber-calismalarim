#When kullanici https://editor.datatables.net/ adresine gider
#		Then new butonuna basar
#		And tum bilgileri girer
#		And Create tusuna basar
#		When kullanici ilk isim ile arama yapar
#		Then isim bolumunde isminin oldugunu dogrular

  Feature: US1009 Datatables sitesine 5 farkli giris yapalim

    Scenario Outline: TC14 kullanici 5 farkli giris yapar
      When kullanici "datatablesUrl" anasayfasinda
      Then new butonuna basar
      And isim bolumune "<firstName>" yazar
      And soyisim bolumune "<lastName>" yazar
      And position bolumune "<position>" yazar
      And office bolumune "<office>" yazar
      And extension bolumune "<extension>" yazar
      And startDate bolumune "<startDate>" yazar
      And salary bolumune "<salary>" yazar
      And Create tusuna basar
      When kullanici "<firstname>" ile arama yapar
      Then isim bolumunde "<firstname>" oldugunu test eder
      And sayfayi kapatir

      Examples:
        | firstName | lastName | position | office | extension | startDate  | salary |
        | Alim      | Alim     | QA       | ankara | UI        | 2021-10-11 | 10000  |
        | Berk      | Can      | tester   | ankara | api       | 2022-05-05   | 11000  |
        | Hüseyin   | Korkmaz  | BA       | berlin | -         | 2022-07-10 | 40000  |
        | Fatih     | Sahin    | PO       | berlin | -         | 2022-03-12 | 45000  |
        | Ahmet     | Kaya     | Tester   | ankara | database  | 2022-06-03 | 11000  |



