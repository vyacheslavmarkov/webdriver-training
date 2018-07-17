package pages;

import Common.Menu;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    private By menuLocator = By.xpath("//*[@id=\"icon-menu\"]/span[1]");
    private By scrollLocator = By.xpath("//*[@id=\"scroll-icon-desktop\"]");

    // constructor
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public Menu clickOnMenu() {
        driver.findElement(menuLocator).click();

        return new Menu(driver);
    }

    public HomePage clickOnScroll() {
        driver.findElement(scrollLocator).click();

        return this;
    }
}
