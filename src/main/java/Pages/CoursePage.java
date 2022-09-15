package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CoursePage {
    public WebDriver driver;

    public CoursePage(WebDriver driver) {
        this.driver = driver;
    }

    public static final String BASEURL = "https://ithillel.ua/courses/java-basic";

    public String getCourseTitle() {
        return driver.getTitle();
    }

    public String getCourseRate() {
        String selector = "//*[@id=\"body\"]/div[1]/main/section[1]/div[3]/div/div/div[2]/div/span";
        return driver.findElement(By.xpath(selector)).getText();
    }

    public String getCourseDescription() {
        String selector = "//*[@id=\"body\"]/div[1]/main/section[2]/div/div/div[1]/div[2]/div/p[1]";
        return driver.findElement(By.xpath(selector)).getText();
    }

}
