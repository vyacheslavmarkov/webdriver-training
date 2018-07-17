package Common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.HomePage;

public class Menu {
    private WebDriver driver;

    private By menuElementHomeLocator = By.xpath("//*[@id=\"main-nav--home\"]");
    private By menuElementWorkLocator = By.xpath("//*[@id=\"main-nav--work\"]");
    private By menuEngineersLocator = By.xpath("//*[@id=\"main-nav--engineers\"]");
    private By menuProductLocator = By.xpath("//*[@id=\"main-nav--product\"]");
    private By menuAboutLocator = By.xpath("//*[@id=\"main-nav--about\"]");
    private By menuContactLocator = By.xpath("//*[@id=\"main-nav--contact\"]");

    // constructor
    public Menu(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage clickOnHome() {
        driver.findElement(menuElementWorkLocator).click();

        return new HomePage(driver);
    }

    // todo change void to appropriate page
    public void clickOnWork() {
        driver.findElement(menuElementWorkLocator).click();
    }
}
