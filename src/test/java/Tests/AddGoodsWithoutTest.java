package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class AddGoodsWithoutTest extends BaseTest {

    @Test(priority = 6, description = "Add in the list goods without comment, price, amount, category")
    public void test6() {

        app.homePage.createNewList(" Sunday", "");
        app.createList.addNewproductToList("Iron", "", 0);
        app.createList.addNewproductToList("Gold", ", 0");
        app.createList.addNewproductToList("Silver", "", 0);
        app.commonHeler.backButtonTwice();
        Assert.assertFalse(Arrays.asList(app.homePage.listArray()).contains("Sunday"));
        app.homePage.deleteList();
        System.out.println("Test6 Add in the list goods without comment, price, amount, category");


    }

}
