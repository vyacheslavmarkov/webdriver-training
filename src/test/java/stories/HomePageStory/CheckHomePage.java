package stories.HomePageStory;

import Common.Menu;
import basics.AbstractTest;
import org.testng.annotations.Test;
import pages.HomePage;

public class CheckHomePage extends AbstractTest {
    private final String HOME_PAGE_TITLE = "Distillery: A Custom Software Design and Development Company";

    @Test
    public void checkHomePage() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get("https://distillery.com/");

        String title = driver.getTitle();
        sa.assertTrue(title.equals(HOME_PAGE_TITLE),
                "Wrong home page title!" +
                        "\nExpected \"" + HOME_PAGE_TITLE + "\n" +
                        "\nGot " + title);

        HomePage homePage = new HomePage(driver);
        homePage.clickOnScroll();

        Menu menu = homePage.clickOnMenu();

        menu.clickOnWork();

        Thread.sleep(1000);
    }
}
