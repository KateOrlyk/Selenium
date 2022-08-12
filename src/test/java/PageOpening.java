import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageOpening {
    public static void main(String[] args) {
        WebDriver driver = DriverFactory.getDriver("CHROME");
        driver.get("https://ithillel.ua/");
        driver.findElement(By.xpath("//*[@id=\"btn-consultation-hero\"]")).click();
    }
}
