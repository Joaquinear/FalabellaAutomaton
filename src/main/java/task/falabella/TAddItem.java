package task.falabella;

import actions.Click;
import actions.IsDisplayed;
import org.openqa.selenium.WebDriver;
import ui.falabella.UiFalabellaAdd;
import ui.falabella.UiFalabellaPay;

public class TAddItem {

    public static void btnaddBagShop(WebDriver driver){
        Click.on(driver,UiFalabellaAdd.btnAddToBag);
        Click.on(driver,UiFalabellaAdd.seeBagShop);
    }
    public static void btnGoToBuy(WebDriver driver){
        Click.on(driver, UiFalabellaPay.btnGoToBuy);
    }
    public static boolean existTextBuyPage(WebDriver driver){
        if(IsDisplayed.element(driver, UiFalabellaPay.getBolsaDeCompras))
            return true;
        return false;
    }
}
