package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BrcPage {

    public BrcPage() {

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy (xpath = "//*[@class='btn btn-primary btn-sm']")
    public WebElement login;

    @FindBy(xpath = "//input[@id='formBasicEmail']")
    public WebElement email;

    @FindBy(xpath = "//input[@id='formBasicPassword']")
    public WebElement password;

    @FindBy(xpath = "//*[@class='btn btn-primary']")
    public WebElement getLogin;

    @FindBy (xpath = "//*[text()='John Walker']")
    public WebElement loginPassed;

}
