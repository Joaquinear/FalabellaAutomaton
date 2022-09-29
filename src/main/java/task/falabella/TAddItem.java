package task.falabella;

import actions.Click;
import actions.GetText;
import actions.IsDisplayed;
import org.openqa.selenium.WebDriver;
import ui.falabella.UiFalabellaAdd;
import ui.falabella.UiFalabellaShopBag;

public class TAddItem {

    public static void btnaddBagShop(WebDriver driver){
        Click.on(driver,UiFalabellaAdd.btnAddToBag);
        Click.on(driver,UiFalabellaAdd.seeBagShop);
    }
    public static void btnGoToBuy(WebDriver driver){
        Click.on(driver, UiFalabellaShopBag.btnGoToBuy);
    }
    public static boolean existTextBuyPage(WebDriver driver){
        if(IsDisplayed.element(driver, UiFalabellaShopBag.textBolsaDeCompras))
            return true;
        return false;

    }
}
