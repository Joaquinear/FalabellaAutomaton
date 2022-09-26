package task.falabella;

import actions.Click;
import actions.Enter;
import actions.EnterText;
import org.openqa.selenium.WebDriver;
import ui.falabella.UiFabellaIndex;

public class TfalabellaIndex {
    public static void search(WebDriver driver, String searchText){
        EnterText.text(driver, UiFabellaIndex.searchBarFallabella,searchText);
        Enter.enter(driver,UiFabellaIndex.searchBarFallabella);
    }
}
