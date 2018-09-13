package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class EditListTest extends BaseTest {
    @Test(priority = 2, description = "Edit name of the exist list")
    public void editList() {
        app.homePage.listRename("Johny Depp");
        Assert.assertFalse(Arrays.asList(app.homePage.listArray()).contains( "Johny Depp"));

    }
}
