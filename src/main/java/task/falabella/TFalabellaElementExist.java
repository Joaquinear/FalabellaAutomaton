package task.falabella;

import actions.IsDisplayed;
import org.openqa.selenium.WebDriver;
import ui.falabella.UiFalabellaPay;

public class TFalabellaElementExist {
    public static boolean isDeliverdHome(WebDriver driver){
        return IsDisplayed.element(driver, UiFalabellaPay.deliveredHome);
    }
}
