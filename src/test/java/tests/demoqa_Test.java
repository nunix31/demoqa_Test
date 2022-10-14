package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
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
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "ToolsQA";
        Assert.assertEquals(expectedTitle, actualTitle);
        actions.sendKeys(Keys.PAGE_DOWN).
                moveToElement(Driver.getDriver().findElement(By.xpath("//*[contains(text(),'Forms')]"))).perform();
        Thread.sleep(2000);
        Driver.getDriver().findElement(By.xpath("//h5[contains(text(),'Forms')]")).click();
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "https://demoqa.com/forms";
        Assert.assertEquals(actualUrl,expectedUrl);
        page.practiceFormButton.click();
        WebElement practiceFormTitle = Driver.getDriver().findElement(By.xpath("//*[text()='Student Registration Form']"));
        Assert.assertTrue(practiceFormTitle.isDisplayed());
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
        WebElement chooseFile = Driver.getDriver().findElement(By.xpath("//*[@id='uploadPicture']"));
        String dosyaYolu = "C:\\Users\\Nurullah Karaköse\\Desktop\\61b9f1ad0c3fb-5626.jpg";
        chooseFile.sendKeys(dosyaYolu);
        page.currentAdressBox.sendKeys("Antakya/HATAY");
        actions.sendKeys(Keys.TAB).sendKeys("NCR").sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys("Delhi").perform();
        actions.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
        Assert.assertTrue(page.submittingMessage.isDisplayed());


    }
}
