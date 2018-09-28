package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;


public class CreateNewListTest extends BaseTest {


    @Test(description = "Create new empty list")
    public void test1() {
        int amountBefore = app.homePage.listArray();
        Assert.assertTrue(app.homePage.createNewList("Rambo", "").backButtonTwice().containList("Rambo"));
        Assert.assertEquals((amountBefore + 1), app.homePage.listArray());
        System.out.println("Test1 Create new empty list");
    }
}


