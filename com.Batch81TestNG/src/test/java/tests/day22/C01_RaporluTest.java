package tests.day22;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BrcPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class C01_RaporluTest extends TestBaseRapor {
    @Test
    public void test01() throws InterruptedException {
        extentTest=extentReports.createTest("Pozitif Test","Geçerli kullanıcı adı ve password ile giriş yapıldı.");

        // -https://www.bluerentalcars.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));
        extentTest.info("Blue Rent a Car sitesine gidildi.");
        // -login butonuna bas
        BrcPage brcPage = new BrcPage();
        Thread.sleep(3000);
        brcPage.login.click();
        extentTest.info("Login butonuna tıklandı.");
        // -test data user email: customer@bluerentalcars.com ,
        brcPage.email.sendKeys(ConfigReader.getProperty("userEmail"));
        // -test data password : 12345 dataları girip login e basın
        brcPage.password.sendKeys(ConfigReader.getProperty("pass"));
        extentTest.info("User true email and password sended.");
        // -login butonuna tiklayin
        brcPage.getLogin.click();
        extentTest.info("Clicked the login button.");
        // -Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
        Assert.assertTrue(brcPage.loginPassed.isDisplayed());
        extentTest.pass("Doğru email ve password ile giriş yapıldığı doğrulandı.");




    }
}
