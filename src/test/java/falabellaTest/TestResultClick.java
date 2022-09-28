package falabellaTest;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import task.falabella.TAddItem;
import task.falabella.TFalabellaClick;
import task.falabella.TFalabellaResult;
import task.falabella.TfalabellaIndex;
import task.google.TGoogleClick;
import task.google.TGoogleSearch;

public class TestResultClick extends BaseTest {
    @Test
    public void itemSelect(){
        String itemClickedText;
        TGoogleSearch.InputSearch(driver,"Falabella colombia");
        TGoogleClick.firstResult(driver);
        TfalabellaIndex.search(driver,searchText);
        itemClickedText = TFalabellaResult.itemClick(driver);
        TFalabellaClick.itemSelect(driver);
        Assert.assertEquals(itemClickedText, TAddItem.itemAdded(driver));
    }
}
