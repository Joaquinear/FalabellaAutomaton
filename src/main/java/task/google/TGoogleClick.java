package task.google;

import actions.Click;
import org.openqa.selenium.WebDriver;
import ui.google.UiGoogleSearch;

public class TGoogleClick {
    public static void firstResult(WebDriver WebDriver){
        Click.on(WebDriver, UiGoogleSearch.googleFirstResultText);
    }
}
