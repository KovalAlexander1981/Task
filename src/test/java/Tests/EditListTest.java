package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class EditListTest extends BaseTest {
    @Test(priority = 2, description = "Edit name of the exist list")
    public void test2() {
        app.homePage.listRename("Johny Depp");
        Assert.assertFalse(Arrays.asList(app.homePage.listArray()).contains("Johny Depp"));

    }

}
