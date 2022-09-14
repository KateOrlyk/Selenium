import Pages.HomePage;
import Pages.TestingPage;
import Util.DataProvider;
import driverConfig.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class testing {
    public class PageOpening {
        static final String BASEURL = "https://dnipro.ithillel.ua/";
        static WebDriver driver = DriverFactory.getDriver("CHROME");
        static HomePage homePage = new HomePage(driver);

        static {
            driver.get(BASEURL);
        }

        public static void main(String[] args) throws Exception {
            homePage.testingCourseButtonClick();
            TestingPage testingPage = new TestingPage(driver);
            testingPage.buttonClick();
            String s = DataProvider.getRandomName();
            System.out.println(s);
            driver.findElement(By.id("input-name-consultation")).sendKeys(s);

            try {
                Thread.sleep(5000);
            } catch (InterruptedException ignore) {

            }
            driver.quit();
        }
    }
}
