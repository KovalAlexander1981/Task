package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class EditListTest extends BaseTest {
    @Test(description = "Edit name of the exist list")
    public void test2() {
       Assert.assertTrue(app.homePage.listRename("Johny Depp").containList("Johny Depp"));
        System.out.println("Test2 Edit name of the exist list");

    }

}
