package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RemoveListWithGoods extends BaseTest{

    @Test(priority = 5, description = "Delete list with goods")
    public void test5 ()  {

        int amountBefore = app.homePage.listArray();
        app.homePage.deleteList();
        Assert.assertEquals((amountBefore-1), app.homePage.listArray());

    }

}
