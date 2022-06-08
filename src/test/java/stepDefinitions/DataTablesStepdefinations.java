package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import pages.DataTablespage;
import utilities.Driver;

public class DataTablesStepdefinations {
DataTablespage dataTablespage=new DataTablespage();
    @Then("isim bolumune {string} yazar")
    public void isim_bolumune_yazar(String isim) {

        Actions actions =new Actions(Driver.getDriver());
       dataTablespage.firstName.sendKeys(isim);
    }

    @Then("soyisim bolumune {string} yazar")
    public void soyisim_bolumune_yazar(String soyIsim) {
       dataTablespage.lastName.sendKeys(soyIsim);
    }

    @Then("position bolumune {string} yazar")
    public void position_bolumune_yazar(String position) {
    dataTablespage.position.sendKeys(position);
    }

    @Then("office bolumune {string} yazar")
    public void office_bolumune_yazar(String office) {
     dataTablespage.office.sendKeys(office);
    }

    @Then("extension bolumune {string} yazar")
    public void extension_bolumune_yazar(String extension) {
       dataTablespage.extn.sendKeys(extension);
    }

    @Then("startDate bolumune {string} yazar")
    public void start_date_bolumune_yazar(String startDate) {
     dataTablespage.startDate.sendKeys(startDate);
    }

    @Then("salary bolumune {string} yazar")
    public void salary_bolumune_yazar(String salary) {
       dataTablespage.salary.sendKeys(salary);
    }

    @Then("Create tusuna basar")
    public void create_tusuna_basar() {
dataTablespage.create.click();
    }

    @When("kullanici {string} ile arama yapar")
    public void kullaniciIleAramaYapar(String firstname) {
        dataTablespage.search.sendKeys(firstname);
    }




    @Then("isim bolumunde {string} oldugunu test eder")
    public void isimBolumundeOldugunuTestEder(String firstname) {

    }

    @Then("new butonuna basar")
    public void newButonunaBasar() {
        dataTablespage.newButonunaBasar.click();
    }
}
