package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RemoveListWithGoodsTest extends BaseTest {

    @Test(priority = 5, description = "Delete list with goods")
    public void test5() {

        int amountBefore = app.homePage.listArray();
        app.homePage.deleteList();
        Assert.assertEquals((amountBefore - 1), app.homePage.listArray());
        System.out.println("Test5 Delete list with goods");

    }

}
