package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DeleteListTest extends BaseTest {

    @Test(priority = 3, description = "Delete empty list")
    public void test3() {
        int amountBefore = app.homePage.listArray();
        app.homePage.deleteList();
        Assert.assertEquals((amountBefore - 1), app.homePage.listArray());

    }

}
