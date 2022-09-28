package task.falabella;

import actions.GetList;
import actions.WaitUntilElement;
import org.openqa.selenium.WebDriver;
import ui.falabella.UiFalabellaResult;

public class TFalabellaResult {
    public static boolean existElement(WebDriver driver) {
        if(WaitUntilElement.isPresent(driver,UiFalabellaResult.presentElement))
            return true;
        return false;
    }
    public static String itemClick(WebDriver driver){
        return GetList.elements(driver, UiFalabellaResult.itemSelect).get(1).getText();
    }
}
