package task.falabella;

import actions.GetText;
import org.openqa.selenium.WebDriver;
import ui.falabella.UiFalabellaAdd;

public class TAddItem {
    public static  String itemAdded(WebDriver driver){
        System.out.println(GetText.text(driver, UiFalabellaAdd.nameItem));
        return GetText.text(driver, UiFalabellaAdd.nameItem);
    }
}
