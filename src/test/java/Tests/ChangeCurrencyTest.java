package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ChangeCurrencyTest extends BaseTest {

    @Test(description = "Change currency in the APP")
    public void test9() {
        String newCurrency = "$";
        app.homePage.createNewList("Asus", "").addNewProductToList("Oil", "23");
        Assert.assertTrue(app.homePage.clickButtonSet().setCategoryCurrency("Currency", newCurrency).backButtonTwice().infoList().contains(newCurrency));
        Assert.assertEquals(newCurrency, app.homePage.openList("Asus").addNewProductToList("Car", "2").trim());
        Assert.assertTrue(app.createList.getCurrency().contains(newCurrency));
        app.createList.backButtonTwice().deleteList().deleteList();
        System.out.println("Test9 Change currency in the APP");
    }
}
