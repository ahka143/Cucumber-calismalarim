package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HMCPage;
import utilities.ConfigReader;

public class HMCStepdefinations {

    HMCPage hmcPage=new HMCPage();
    @Then("Log in yazisina tiklar")
    public void log_in_yazisina_tiklar() {
hmcPage.loginButonu.click();
    }
    @Then("gecerli username girer")
    public void gecerli_username_girer() {
       hmcPage.usernameKutusu.sendKeys(ConfigReader.getProperty("hmcValidUserName"));
    }
    @Then("gecerli password girer")
    public void gecerli_password_girer() {
   hmcPage.passwordKutusu.sendKeys(ConfigReader.getProperty("hmcValidPassword"));
    }
    @Then("Login butonuna basar")
    public void login_butonuna_basar() {
    hmcPage.loginButonu2.click();
    }
    @Then("sayfaya giris yaptigini kontrol eder")
    public void sayfaya_giris_yaptigini_kontrol_eder() {
        Assert.assertTrue(hmcPage.listOfUsersElementi.isDisplayed());
    }

    @And("gecersiz username girer")
    public void gecersizUsernameGirer() {
        hmcPage.usernameKutusu.sendKeys(ConfigReader.getProperty("hmcInvalidUserName"));
    }

    @And("gecersiz password girer")
    public void gecersizPasswordGirer() {
        hmcPage.passwordKutusu.sendKeys(ConfigReader.getProperty("hmcInvalidPassword"));
    }

    @Then("sayfaya giris yapilamadigini kontrol eder")
    public void sayfayaGirisYapilamadiginiKontrolEder() {
        Assert.assertTrue(hmcPage.loginButonu2.isDisplayed());
    }

    @And("gecersiz username olarak{string} girer")
    public void gecersizUsernameOlarakGirer(String gecersizUsername) {
        hmcPage.usernameKutusu.sendKeys(gecersizUsername);
    }

    @And("gecersiz password olarak{string} girer")
    public void gecersizPasswordOlarakGirer(String gecersizpassword) {
        hmcPage.passwordKutusu.sendKeys(gecersizpassword);
    }


    @Then("sayfaya giris yapilamadigini test eder")
    public void sayfayaGirisYapilamadiginiTestEder() {
        Assert.assertTrue(hmcPage.loginButonu2.isDisplayed());
    }
}
