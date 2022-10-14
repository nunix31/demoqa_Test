package tests.day21;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class C01_ScreenShotReusableMethod {

    @Test
    public void test01() throws IOException {

        //Hepsiburada sayfasına gidiniz.
        Driver.getDriver().get("https://hepsiburada.com");
        // ve sayfanın resmini alınız.
        ReusableMethods.getScreenshot("hepsiburada");
        //sonra sayfayı kapatınız.
        Driver.closeDriver();
    }

    @Test
    public void test02() throws IOException {
        //amazon sayfasına gidiniz.
        Driver.getDriver().get(ConfigReader.getProperty("amznUrl"));
        //nutella aratınız.
        AmazonPage amznPage= new AmazonPage();
        amznPage.aramaKutusu.sendKeys("Nutella", Keys.ENTER);
        //arama sonuc yazısı WebElement'inin resmini alınız.
        ReusableMethods.getScreenshotWebElement("AramaSonucWE",amznPage.aramaSonucuWE);


    }
}
