package basics;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public abstract class AbstractTest {
    protected WebDriver driver;
    protected SoftAssert sa;

    @BeforeTest
    protected void beforeTest() {
        sa = new SoftAssert();

        System.setProperty("webdriver.gecko.driver", "/Users/friend/Downloads/geckodriver");
        driver = new FirefoxDriver();
    }

    @AfterTest
    protected void afterTest() {
        sa.assertAll();

        if (driver != null)
            driver.close();
    }
}
