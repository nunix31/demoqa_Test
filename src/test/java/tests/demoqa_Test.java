package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DemoqaPage;
import utilities.ConfigReader;
import utilities.Driver;


public class demoqa_Test {
    Actions actions = new Actions(Driver.getDriver());
    DemoqaPage page = new DemoqaPage();

    @Test
    public void testDemoqa() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("demoqaUrl"));
        actions.sendKeys(Keys.PAGE_DOWN).
                moveToElement(Driver.getDriver().findElement(By.xpath("//*[contains(text(),'Forms')]"))).perform();
        Thread.sleep(2000);
        Driver.getDriver().findElement(By.xpath("//h5[contains(text(),'Forms')]")).click();
        page.practiceFormButton.click();
        page.nameBox.sendKeys("Nurullah");
        page.lastNameBox.sendKeys("Karakose");
        page.eMailBox.sendKeys("karakosenurullah@gmail.com");
        page.genderMale.click();
        page.phoneNumber.sendKeys("5468014438");
        actions.sendKeys(Keys.PAGE_DOWN).moveToElement(page.birthDayBox).perform();
        actions.click(page.birthDayBox).doubleClick().perform();
        page.birthDayBox.sendKeys("24 Jan 1992");
        page.phoneNumber.click();
        page.subjectsBox.click();
        actions.sendKeys("Computer Science").sendKeys(Keys.ENTER).perform();
        page.hobbiesSportButton.click();
        page.currentAdressBox.sendKeys("Antakya/HATAY");
        actions.sendKeys(Keys.TAB).sendKeys("NCR").sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys("Delhi").perform();
        actions.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
        Assert.assertTrue(page.submittingMessage.isDisplayed());






    }
}
