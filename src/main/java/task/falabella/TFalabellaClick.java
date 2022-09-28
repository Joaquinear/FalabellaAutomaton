package task.falabella;

import actions.Click;
import org.openqa.selenium.WebDriver;
import ui.falabella.UiFalabellaResult;

public class TFalabellaClick {
    public static void itemSelect(WebDriver driver){
        Click.on(driver, UiFalabellaResult.itemSelect);
    }
}
