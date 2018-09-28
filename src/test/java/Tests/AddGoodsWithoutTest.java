package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class AddGoodsWithoutTest extends BaseTest {

    @Test(description = "Add in the list goods without comment, price, amount, category")
    public void test6() {

        Assert.assertTrue(app.homePage.createNewList("Sunday", "")
                .addNewProductToList("Iron", "", 0)
                .addNewProductToList("Gold", "", 0)
                .backButtonTwice()
                .containList("Sunday"));
        app.homePage.deleteList();
        System.out.println("Test6 Add in the list goods without comment, price, amount, category");


    }

}
