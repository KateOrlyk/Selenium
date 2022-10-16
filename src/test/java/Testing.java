import Pages.HomePage;
import Pages.TestingPage;
import Util.DataProvider;
import driverConfig.BROWSER;
import driverConfig.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Testing {
    //    public class PageOpening {
    static final String BASEURL = "https://dnipro.ithillel.ua/";
    static WebDriver driver = DriverFactory.getDriver(BROWSER.valueOf("CHROME"));
    static HomePage homePage = new HomePage(driver);

    static {
        driver.get(BASEURL);
    }

    public static void main(String[] args) throws Exception {
        homePage.testingCourseButtonClick();
        TestingPage testingPage = new TestingPage(driver);
        testingPage.buttonClick();
        driver.findElement(By.id("input-name-consultation")).sendKeys(DataProvider.getRandomAge());

        try {
            Thread.sleep(5000);
        } catch (InterruptedException ignore) {

        }
        driver.quit();
    }
}
