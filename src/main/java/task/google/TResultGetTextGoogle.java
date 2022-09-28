package task.google;

import actions.GetText;
import org.openqa.selenium.WebDriver;
import ui.google.UiGoogleSearch;

public class TResultGetTextGoogle {
    public static String firstResult(WebDriver driver){
        return GetText.text(driver,UiGoogleSearch.googleFirstResultText);
    }
}
