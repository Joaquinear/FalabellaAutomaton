package task.falabella;

import actions.GetText;
import org.openqa.selenium.WebDriver;
import ui.falabella.UiFalabellaAdd;
import ui.falabella.UiFalabellaPay;

public class TGetTextFalabella {
    public static  String getTextItemAdded(WebDriver driver){
        System.out.println(GetText.text(driver, UiFalabellaAdd.nameItem));
        return GetText.text(driver, UiFalabellaAdd.nameItem);
    }
    public static String getTextBagShop(WebDriver driver){
        return GetText.text(driver, UiFalabellaPay.getBolsaDeCompras);
    }
    public static String getTextDeliver(WebDriver driver){
        return GetText.text(driver,UiFalabellaPay.getDeliveredText);
    }
    public static String getTextPay(WebDriver driver){
        return GetText.text(driver, UiFalabellaPay.getPayText);
    }
    public static String getDespachoMode(WebDriver driver){
        return GetText.text(driver, UiFalabellaPay.modeDeliver);
    }
}
