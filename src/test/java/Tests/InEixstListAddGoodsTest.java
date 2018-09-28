package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import TestDate.Tare;


public class InEixstListAddGoodsTest extends BaseTest {

    @Test(description = "In list that exist add new good")
    public void test7() {
        int f = app.homePage.createNewList("January", "").addNewProductToList("Cat food", "22", "1", Tare.pack.name(), "For my kitty", "Pet products");
        app.utils.backButtonTwice();
        int g = app.homePage.openList("January").addNewProductToList("Toys", "44", "5", Tare.bottles.name(), "Good", "Child products");
        Assert.assertEquals(f + g, app.createList.getCheckPrice());
        app.utils.backButtonTwice();
        Assert.assertTrue(app.homePage.infoList().contains(f + g + ""));
        app.homePage.deleteList();
        System.out.println("Test7 In list that exist add new good");
    }
}
