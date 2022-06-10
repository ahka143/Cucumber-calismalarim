package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Assert;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelStepDefinations {
Workbook workbook;
    @Given("kullanici excel dosyasini kullanilabilir hale getirir")
    public void kullanici_excel_dosyasini_kullanilabilir_hale_getirir() throws IOException {
        String dosyaYolu="src/test/resources/ulkeler.xlsx";
        FileInputStream fis=new FileInputStream(dosyaYolu);
        workbook= WorkbookFactory.create(fis);
    }

    @Then("{int}.satirdaki {int}.hucreyi yazdirir")
    public void satirdaki_hucreye_yazdirir(Integer satir, Integer sutun) {
        System.out.println(workbook.getSheet("Sayfa1")
                .getRow(satir).getCell(sutun).getStringCellValue());


    }

    @And("baskenti {string} olan ulke ismini yazdirir")
    public void baskentiOlanUlkeIsminiYazdirir(String baskent) {
int satirSayisi=workbook.getSheet("Sayfa1").getLastRowNum();

        for (int i = 0; i <=satirSayisi ; i++) {
            if (workbook.getSheet("Sayfa1").getRow(i).getCell(1).toString().equals(baskent)){
                System.out.println(workbook.getSheet("Sayfa1").getRow(i).getCell(0).toString());
            }
        }

    }

    @Then("Ulke sayisinin {int} oldugunu test eder")
    public void ulke_sayisinin_oldugunu_test_eder(Integer ulkeSayisi) {

        int actualUlkeSayisi=workbook.getSheet("Sayfa1").getLastRowNum();
        Assert.assertEquals(actualUlkeSayisi, (int) ulkeSayisi);

    }

    @Then("Fiziki olarak kullanilan satir sayisinin {int} oldugunu test eder")
    public void fiziki_olarak_kullanilan_satir_sayisinin_oldugunu_test_eder(Integer fizikiKullanilanSatirSayisi) {

        int actualFizikiKulSatirSay=workbook.getSheet("Sayfa1").getPhysicalNumberOfRows();
        Assert.assertEquals(actualFizikiKulSatirSay, (int) fizikiKullanilanSatirSayisi);

    }




}
