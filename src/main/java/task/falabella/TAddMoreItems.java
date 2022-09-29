package task.falabella;

import actions.Click;
import org.openqa.selenium.WebDriver;
import ui.falabella.UiFalabellaAdd;
import ui.falabella.UiFalabellaShopBag;

public class TAddMoreItems {
    public static void quantityItemsAdded(WebDriver driver, int quantity){
        for(int i= 0; i< quantity;i++){
            Click.on(driver, UiFalabellaShopBag.addMoreItem);
        }
    }
}
