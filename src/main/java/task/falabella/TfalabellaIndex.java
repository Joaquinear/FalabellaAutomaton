package task.falabella;

import actions.*;
import org.openqa.selenium.WebDriver;
import ui.falabella.UiFabellaIndex;
import ui.falabella.UiFalabellaResult;

public class TfalabellaIndex {
    public static void search(WebDriver driver, String searchText){
        EnterText.text(driver, UiFabellaIndex.searchBarFallabella,searchText);
        Enter.enter(driver,UiFabellaIndex.searchBarFallabella);
    }

}
