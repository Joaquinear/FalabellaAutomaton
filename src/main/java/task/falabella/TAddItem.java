package task.falabella;

import actions.GetText;
import org.openqa.selenium.WebDriver;
import ui.falabella.UiFalabellaPageAdd;

public class TAddItem {
    public static  String itemAdded(WebDriver driver){
        System.out.println(GetText.text(driver, UiFalabellaPageAdd.nameItem));
        return GetText.text(driver, UiFalabellaPageAdd.nameItem);
    }
}
