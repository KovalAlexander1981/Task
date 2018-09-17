package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class CreateNewListTest extends  BaseTest{


    @Test(priority = 1, description = "Create new empty list")
    public void test1 ()  {
       int amountBefore = app.homePage.listArray();
        app.homePage.createNewList("Rambo");
        app.commonHeler.backButtonTwice();
        Assert.assertTrue(app.homePage.findList("Rambo"));
        Assert.assertEquals((amountBefore+1), app.homePage.listArray());

    }


    }


