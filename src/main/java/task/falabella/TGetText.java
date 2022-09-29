package task.falabella;

import actions.GetText;
import org.openqa.selenium.WebDriver;
import ui.falabella.UiFalabellaAdd;
import ui.falabella.UiFalabellaShopBag;

public class TGetText {
    public static  String getTextItemAdded(WebDriver driver){
        System.out.println(GetText.text(driver, UiFalabellaAdd.nameItem));
        return GetText.text(driver, UiFalabellaAdd.nameItem);
    }
    public static String getTextBagShop(WebDriver driver){
        return GetText.text(driver, UiFalabellaShopBag.textBolsaDeCompras);
    }
}
