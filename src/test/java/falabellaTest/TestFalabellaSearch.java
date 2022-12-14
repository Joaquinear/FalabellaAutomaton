package falabellaTest;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import task.falabella.TFalabellaResult;
import task.falabella.TfalabellaIndex;
import task.google.TGoogleClick;
import task.google.TGoogleSearch;

public class TestFalabellaSearch extends BaseTest {
    @Test
    public void falabellaWhatSearch() {
        TGoogleSearch.InputSearch(driver,"Falabella colombia");
        TGoogleClick.firstResult(driver);
        TfalabellaIndex.search(driver,searchText);
        Assert.assertTrue(TFalabellaResult.existElement(driver));
    }
}
