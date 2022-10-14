package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public abstract class TestBaseBeforeClassAfterClass {
    // abstract bu class'dan başka bir yerden bir obje oluşturulmaması için konulur.
    protected static WebDriver driver;

    @BeforeClass (groups = "gp1")
    public static void setUp() throws Exception {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @AfterClass (groups = "gp1")
    public static void tearDown() throws InterruptedException {
        driver.quit();
    }
}
