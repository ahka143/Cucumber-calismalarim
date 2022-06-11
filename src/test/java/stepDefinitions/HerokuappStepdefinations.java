package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HerokuappPage;
import utilities.Driver;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class HerokuappStepdefinations {

    HerokuappPage herokuappPage = new HerokuappPage();

    @Given("add element butonuna basar")
    public void add_element_butonuna_basar() {
        herokuappPage.addButonu.click();
    }

    @Then("Delete butonu gorunur oluncaya kadar bekler")
    public void delete_butonu_gorunur_oluncaya_kadar_bekler() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(herokuappPage.birinciDeleteButonu));
    }

    @Then("Delete butonunun gorunur oldugunu test eder")
    public void delete_butonunun_gorunur_oldugunu_test_eder() throws IOException {
        File temp=herokuappPage.addButonu.getScreenshotAs(OutputType.FILE);
        File addButonuScreenShot=new File("target/screenshots/ss.jpeg");
        FileUtils.copyFile(temp,addButonuScreenShot);
        Assert.assertTrue(herokuappPage.birinciDeleteButonu.isDisplayed());
    }

    @Then("Delete butonuna basar")
    public void delete_butonuna_basar() {
        herokuappPage.birinciDeleteButonu.click();
    }

    @Then("Delete butonunun gorunmedigini test eder")
    public void delete_butonunun_gorunmedigini_test_eder() {
        Assert.assertEquals(0, herokuappPage.DeleteButonlariList.size());
      //  Assert.assertTrue(herokuappPage.DeleteButonlariList.isEmpty()); "Diger arkadaslar bu sekilde yapmislar "

    }

}
