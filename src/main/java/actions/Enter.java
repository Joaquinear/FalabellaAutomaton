package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Enter {
    public static void enter(WebDriver WebDriver, By locator){
        WebDriver.findElement(locator).sendKeys(Keys.ENTER);
    }
}
