package Pages;

import Util.Util;
import cucumber.BaseCucumber;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CertificatePage extends BaseCucumber {
    @FindBy(name = "certificate")
    static
    WebElement cerField;

    @FindBy(xpath = "//button[contains(@class,'btn') and contains(@class,'certificate-check_submit')]")
    static
    WebElement buttonSubmit;

    @FindBy(xpath = "//p[@class='certificate-check_message']")
    static
    WebElement messageField;

    public static void getResultCertificate(String cer) {
        cerField.sendKeys(cer);
        buttonSubmit.click();

    }

    public static String getMessage() {
        try {
            Util.waitVisibilityOfElement(driver, messageField, 5);
            return messageField.getText();
        } catch (TimeoutException ignore) {
            return "Certificate exist";
        }
    }

    public CertificatePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
}