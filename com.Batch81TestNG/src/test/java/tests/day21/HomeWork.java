package tests.day21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HepsiBuradaPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseBeforeMethodAfterMethod;

import java.util.ArrayList;
import java.util.List;


public class HomeWork extends TestBaseBeforeMethodAfterMethod {
    Select select;/*

    @Test
    public void testHomeWork() throws InterruptedException {

        //hepsiburada sitesindeki elektronik/bilgisayar/tablet sekmesinde bulunan her sayfaya gidiniz ve ss alınız.
        Actions actions = new Actions(driver);
        driver.get("https://hepsiburada.com");
        WebElement elektronik = driver.findElement(By.xpath
                ("(//*[@class='sf-MenuItems-WulWXvlfIAwNiOUGY7FP'])[1]"));
        actions.moveToElement(elektronik).perform();

        WebElement bilgisayarTablet = driver.findElement(By.xpath
                ("//*[text()='Bilgisayar/Tablet']"));
        actions.moveToElement(bilgisayarTablet).perform();

        List<WebElement> drops = bilgisayarTablet.findElements(" ,");
        System.out.println(drops.size());

        for (WebElement w : drops) {
            System.out.println(w.getText());
        }


    }
    */
}

