package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DemoqaPage {
    public DemoqaPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "(//*[@class='card-body'])[2]")
    public WebElement formsButton;

    @FindBy (xpath = "//*[text()='Practice Form']")
    public WebElement practiceFormButton;

    @FindBy (xpath = "//*[@id='firstName']")
    public WebElement nameBox;

    @FindBy (xpath = "//*[@id='lastName']")
    public WebElement lastNameBox;

    @FindBy (xpath = "//*[@id='userEmail']")
    public WebElement eMailBox;

    @FindBy (xpath = "//*[text()='Male']")
    public WebElement genderMale;

    @FindBy (xpath = "//*[@id='userNumber']")
    public WebElement phoneNumber;

    @FindBy (xpath = "//*[@id='dateOfBirthInput']")
    public WebElement birthDayBox;

    @FindBy (xpath = "//*[@id='subjectsContainer']")
    public WebElement subjectsBox;

    @FindBy (xpath = "//*[text()='Sports']")
    public WebElement hobbiesSportButton;

    @FindBy (xpath = "//*[@id='currentAddress']")
    public WebElement currentAdressBox;

    @FindBy (xpath = "//*[@class=' css-1hwfws3']")
    public WebElement stateButton;

    @FindBy (xpath = "//*[@class='btn btn-primary']")
    public WebElement submitButton;

    @FindBy (xpath = "//*[text()='Thanks for submitting the form']")
    public WebElement submittingMessage;








}
