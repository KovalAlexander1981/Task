package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DeleteListTest extends BaseTest {

    @Test(description = "Delete empty list")
    public void test3() {
        int amountBefore = app.homePage.buylists();
        Assert.assertEquals((amountBefore - 1), app.homePage.deleteList().buylists());
        System.out.println("Test3 Delete empty list");

    }

}
