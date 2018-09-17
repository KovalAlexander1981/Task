package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class AddGoodsWithoutTest extends BaseTest {

    @Test(priority = 6, description = "Add in the list goods without comment, price, amount, category")
    public void test6 ()  {

        app.homePage.createNewList(" Sunday");
        app.createList.addNewproductToList("Iron");
        app.createList.addNewproductToList("Gold");
        app.createList.addNewproductToList("Silver");
        app.commonHeler.backButtonTwice();
        Assert.assertFalse(Arrays.asList(app.homePage.listArray()).contains( "Sunday"));
        app.homePage.deleteList();

    }

}
