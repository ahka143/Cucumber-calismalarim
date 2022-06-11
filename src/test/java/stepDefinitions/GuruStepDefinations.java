package stepDefinitions;

import io.cucumber.java.en.Given;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import pages.GuruPage;
import utilities.Driver;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GuruStepDefinations {

    GuruPage guruPage = new GuruPage();


    @Given("{string}, sutunundaki tum degerleri yazdirir")

    public void sutunundaki_tum_degerleri_yazdirir(String sutunAdi) throws IOException {
        TakesScreenshot ts= (TakesScreenshot) Driver.getDriver();
        File temp= ts.getScreenshotAs(OutputType.FILE);
        File resim =new File("target/screenshots/ss.jpeg");
        FileUtils.copyFile(temp,resim);
        int sutun = -1;
        for (int i = 0; i < guruPage.headerList.size(); i++) {
            if (guruPage.headerList.get(i).getText().equals(sutunAdi)) {
                sutun = i+1;
                break;
            }
        }
        List<WebElement> secilenSutunList=new ArrayList<>();
        if (sutun!=-1){
secilenSutunList=Driver.getDriver().findElements(By.xpath("//tr//td["+sutun+"]"));
        }else {
            System.out.println("sutun bulunamadi");
        }


        for (WebElement each:secilenSutunList
             ) {
            System.out.println(each.getText());
        }
    }
}
