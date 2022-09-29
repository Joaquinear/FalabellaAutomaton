package falabellaTest;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import task.falabella.*;
import task.google.TGoogleClick;
import task.google.TGoogleSearch;

public class TestFalabellaAddItem extends BaseTest {
    @Test
    public void addBag(){
        //String itemClickedText;
        TGoogleSearch.InputSearch(driver,"Falabella colombia");
        TGoogleClick.firstResult(driver);
        TfalabellaIndex.search(driver,searchText);
        //itemClickedText = TFalabellaResult.itemClickText(driver);
        TFalabellaClick.itemSelect(driver);
        TAddItem.btnaddBagShop(driver);
        TAddMoreItems.quantityItemsAdded(driver,2);
        Assert.assertTrue(TAddItem.existTextBuyPage(driver));
    }
}
