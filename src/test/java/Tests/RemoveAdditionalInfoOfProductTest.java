package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RemoveAdditionalInfoOfProductTest extends BaseTest {
    @Test(priority = 9, description = "Remove from list additional info about products ")
    public void test10() {
        app.homePage.createNewList("Final");
        app.createList.addNewproductToList("Cake", "2", "1", "box", "try", "Dairy produce");
        String a = app.createList.getComents();
        String b = app.createList.getAmount();
        String c = app.createList.getPrice();
        app.homePage.clickButtonSet();
        app.settingsPage.clicklistRemoveSettings();
        app.commonHeler.backButton();
        app.homePage.openList("Final");
        Assert.assertTrue(app.createList.checkElement(a));
        Assert.assertTrue(app.createList.checkElement(b));
        Assert.assertTrue(app.createList.checkElement(c));


    }


}
