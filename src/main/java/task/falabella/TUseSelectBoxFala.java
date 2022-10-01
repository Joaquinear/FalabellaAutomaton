package task.falabella;

import actions.GetSelect;
import actions.GetText;
import org.openqa.selenium.WebDriver;
import ui.falabella.UiFalabellaPay;

public class TUseSelectBoxFala {
    public static void choseDepartament(WebDriver driver,String textChose){
        GetSelect.select(driver, UiFalabellaPay.departament,textChose);
    }
    public static void choseCity(WebDriver driver,String textCity){
        GetSelect.select(driver,UiFalabellaPay.city,textCity);
    }
    public static void choseNeighborhood(WebDriver driver,String textNeighborhood){
        GetSelect.select(driver,UiFalabellaPay.neighborhood,textNeighborhood);
    }
}
