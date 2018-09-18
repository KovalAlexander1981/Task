package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ChangeCurrencyTest extends BaseTest {

    @Test(priority = 8, description = "Change currency in the APP")
    public void test8() {
        String newCurrency = "$";
        app.homePage.createNewList("Asus");
        app.createList.addNewproductToList("Oil", "23");
        app.homePage.clickButtonSet();
        app.settingsPage.setCategory("Currency");
        app.settingsPage.setCurrency(newCurrency);
        app.commonHeler.backButton();
        Assert.assertTrue(app.homePage.infoList().contains(newCurrency));
        app.homePage.openList("Asus");
        Assert.assertEquals(newCurrency, app.createList.addNewproductToList("Car", "2").trim());
        Assert.assertTrue(app.createList.getCurrency().contains(newCurrency));
        app.homePage.deleteList();
        System.out.println("Test8 Change currency in the APP");


    }

}
