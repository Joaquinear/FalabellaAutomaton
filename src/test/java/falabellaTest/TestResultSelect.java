package falabellaTest;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import task.falabella.*;
import task.google.TGoogleClick;
import task.google.TGoogleSearch;

public class TestResultSelect extends BaseTest {
    @Test
    public void itemSelect(){
        String itemClickedText;
        TGoogleSearch.InputSearch(driver,"Falabella colombia");
        TGoogleClick.firstResult(driver);
        TfalabellaIndex.search(driver,searchText);
        itemClickedText = TFalabellaResult.itemClickText(driver);
        TFalabellaClick.itemSelect(driver);
        Assert.assertEquals(itemClickedText, TGetText.getTextItemAdded(driver));
    }
}
