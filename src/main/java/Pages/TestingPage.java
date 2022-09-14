package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestingPage {
    @FindBy(className = "hero_group")
//    @FindBy(className = "form-field_row")
    WebElement group;

    public void buttonClick() {
        group.findElement(By.tagName("button")).click();
    }

    public TestingPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
