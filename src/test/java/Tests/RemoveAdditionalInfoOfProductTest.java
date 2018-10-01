package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import TestDate.Tare;


public class RemoveAdditionalInfoOfProductTest extends BaseTest {
    @Test(description = "Remove from list additional info about products ")
    public void test8() {
        app.homePage.createNewList("Final", "").addNewProductToList("Cake", "2", "1", Tare.l.name(), "try", "Dairy produce");
        String a = app.createList.getComents();
        String b = app.createList.getAmount();
        String c = app.createList.getPrice();
        app.homePage.clickButtonSet().clickListRemoveSettings().backButtonTwice().openList("Final");
        Assert.assertTrue(app.createList.checkElement(a));
        Assert.assertTrue(app.createList.checkElement(b));
        Assert.assertTrue(app.createList.checkElement(c));
        app.utils.backButton();
        System.out.println("Test8 Remove from list additional info about products ");


    }


}
