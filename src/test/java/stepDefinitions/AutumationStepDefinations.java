package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.AutomationPage;
import utilities.Driver;

public class AutumationStepDefinations {

    AutomationPage automationPage = new AutomationPage();
    Faker faker = new Faker();

    @Given("user sign in linkine tiklar")
    public void user_sign_in_linkine_tiklar() {
        automationPage.singInButton.click();
    }

    @Given("user Create and account bolumune email adresi girer")
    public void user_create_and_account_bolumune_email_adresi_girer() {
        automationPage.emailTextBox.sendKeys(faker.internet().emailAddress());
    }

    @Given("Create an Account butonuna basar")
    public void create_an_account_butonuna_basar() {
        automationPage.createAccountButton.click();
    }

    @Given("user kisisel bilgilerini ve iletisim bilgilerini girer")
    public void user_kisisel_bilgilerini_ve_iletisim_bilgilerini_girer() {
        Actions actions=new Actions(Driver.getDriver());
        actions.click(automationPage.gender)
                .sendKeys(Keys.TAB,faker.name().firstName())
                .sendKeys(Keys.TAB,faker.name().lastName())
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB,faker.internet().password())
                .sendKeys(Keys.TAB,"10")
                .sendKeys(Keys.TAB,"October")
                .sendKeys(Keys.TAB,"1978")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB,faker.address().fullAddress())
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB,"Alaska")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.TAB,"23456")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB,faker.phoneNumber().cellPhone())
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB,Keys.ENTER).perform();

    }

    @Given("user Register butonuna basar")
    public void user_register_butonuna_basar() {

    }

    @Then("hesap olustugunu dogrular")
    public void hesap_olustugunu_dogrular() {
        Assert.assertTrue(automationPage.positiveResultText.isDisplayed());
    }

    @And("email kutusuna @isareti olmayan email adresi yazar ve enter'a tiklar")
    public void emailKutusunaIsaretiOlmayanEmailAdresiYazarVeEnterATiklar() {
        automationPage.emailTextBox.sendKeys("ddasdasd.com"+Keys.ENTER);
    }
}
