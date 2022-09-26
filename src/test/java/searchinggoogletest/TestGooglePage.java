package searchinggoogletest;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import task.google.TGoogleClick;
import task.google.TGoogleSearch;
import task.google.TResultGetTextGoogle;

public class TestGooglePage extends BaseTest {
    @Test
    public void testGoogleSerach(){
        TGoogleSearch.InputSearch(driver,"Falabella colombia");
        Assert.assertEquals("Lo encontré en Falabella.com", TResultGetTextGoogle.firstResult(driver));
        System.out.println(TResultGetTextGoogle.firstResult(driver));
    }
    @Test
    public void testGoogleResultClick(){
        TGoogleSearch.InputSearch(driver,"Falabella colombia");
        TGoogleClick.firstResult(driver);
        Assert.assertEquals("Lo encontré en Falabella.com",driver.getTitle());
    }
}
