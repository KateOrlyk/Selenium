package apium.util;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class AppiumUtil {
    public static void scrollToElementVisibilityOf(WebDriver d, By by){
        JavascriptExecutor js=(JavascriptExecutor) d;
        boolean bool=true;
        while (bool){
            try {
                d.findElement(by);
                bool=false;
            }catch (Exception ignore){
                js.executeScript("window.scrollBy(0,400)");
            }
        }
    }
}
