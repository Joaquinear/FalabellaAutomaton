package falabellaTest;

import actions.GetList;
import actions.WaitUntilElement;
import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import task.falabella.TfalabellaIndex;
import task.google.TGoogleClick;
import task.google.TGoogleSearch;
import ui.falabella.UiFalabellaResult;

public class TestFalabellaSearch extends BaseTest {
    @Test
    public void falabellaWhatSearch(){
        TGoogleSearch.InputSearch(driver,"Falabella colombia");
        TGoogleClick.firstResult(driver);
        TfalabellaIndex.search(driver,"Consola ps5");
        //Assert.assertEquals("Consola Sony PS5 Digital 825GB'", WaitUntilElement.isPresent(driver,GetList.elements(driver,UiFalabellaResult.itemSelect).get(0));
    }
    @Test
    public void falabellaResultElement(){

    }
}
