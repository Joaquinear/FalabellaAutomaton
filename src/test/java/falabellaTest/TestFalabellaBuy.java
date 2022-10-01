package falabellaTest;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import task.falabella.*;
import task.google.TGoogleClick;
import task.google.TGoogleSearch;

public class TestFalabellaBuy extends BaseTest {
    @Test
    public void addBag(){
        TGoogleSearch.InputSearch(driver,"Falabella colombia");
        TGoogleClick.firstResult(driver);
        TfalabellaIndex.search(driver,searchText);
        TFalabellaClick.itemSelect(driver);
        TAddItem.btnaddBagShop(driver);
        TAddMoreItems.quantityItemsAdded(driver,2);
        Assert.assertTrue(TAddItem.existTextBuyPage(driver));
    }

    @Test
    public void delivered(){
        TGoogleSearch.InputSearch(driver,"Falabella colombia");
        TGoogleClick.firstResult(driver);
        TfalabellaIndex.search(driver,searchText);
        TFalabellaClick.itemSelect(driver);
        TAddItem.btnaddBagShop(driver);
        TAddMoreItems.quantityItemsAdded(driver,2);
        TAddItem.btnGoToBuy(driver);
        Assert.assertEquals("Elige tus opciones de despacho",TGetTextFalabella.getDespachoMode(driver));
        TUseSelectBoxFala.choseDepartament(driver,"ANTIOQUIA");
        TUseSelectBoxFala.choseCity(driver,"MEDELLIN");
        TUseSelectBoxFala.choseNeighborhood(driver,"MEDELLIN");
        TFalabellaClick.continueClick(driver);
        Assert.assertTrue(TFalabellaElementExist.isDeliverdHome(driver));
    }

    @Test
    public void givenDirections(){
        TGoogleSearch.InputSearch(driver,"Falabella colombia");
        TGoogleClick.firstResult(driver);
        TfalabellaIndex.search(driver,searchText);
        TFalabellaClick.itemSelect(driver);
        TAddItem.btnaddBagShop(driver);
        TAddMoreItems.quantityItemsAdded(driver,2);
        TAddItem.btnGoToBuy(driver);
        Assert.assertEquals("Elige tus opciones de despacho",TGetTextFalabella.getDespachoMode(driver));
        TUseSelectBoxFala.choseDepartament(driver,"ANTIOQUIA");
        TUseSelectBoxFala.choseCity(driver,"MEDELLIN");
        TUseSelectBoxFala.choseNeighborhood(driver,"MEDELLIN");
        TFalabellaClick.continueClick(driver);
        Assert.assertTrue(TFalabellaElementExist.isDeliverdHome(driver));
    }

    @Test
    public void
}
