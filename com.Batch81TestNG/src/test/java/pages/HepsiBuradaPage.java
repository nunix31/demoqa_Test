package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class HepsiBuradaPage {
    public HepsiBuradaPage() { // constructor oluşuturup public yapmamız gerekir.

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy (xpath = "(//*[@class='sf-MenuItems-UHHCg2qrE5_YBqDV_7AC'])[1]")
    public WebElement elektronik;

    @FindBy (xpath = "//*[text()='Bilgisayar/Tablet']")
    public WebElement bilgisayarTablet;




}
