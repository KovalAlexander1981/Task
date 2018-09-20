package Tests;

import Pages.Tare;
import org.testng.Assert;
import org.testng.annotations.Test;


public class InEixstListAddGoodsTest extends BaseTest {

    @Test(priority = 7, description = "In list that exist add new good")
    public void test7() {

        app.homePage.createNewList("January", "");
        int f = app.createList.addNewproductToList("Cat food", "22", "1", Tare.pack.name(), "For my kitty", "Pet products");
        app.commonHeler.backButtonTwice();
        app.homePage.openList("January");
        int g = app.createList.addNewproductToList("Toys", "44", "5", Tare.bottles.name(), "Good", "Child products");
        Assert.assertEquals(f + g, app.createList.getCheckPrice());
        app.commonHeler.backButtonTwice();
        Assert.assertTrue(app.homePage.infoList().contains(f + g + ""));
        app.homePage.deleteList();
        System.out.println("Test7 In list that exist add new good");


    }

}
