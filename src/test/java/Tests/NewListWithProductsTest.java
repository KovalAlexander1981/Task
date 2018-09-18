package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NewListWithProductsTest extends BaseTest {

    @Test(priority = 4, description = "Create new list with products")
    public void test4() {

        app.homePage.createNewList("Happy Friday");
        int f = app.createList.addNewproductToList("Cat food", "22", "1", "box", "For my kitty", "Pet products");
        int s = app.createList.addNewproductToList("Milk", "18", "1", "bottles", "i like milk", "Dairy produce");
        int d = app.createList.addNewproductToList("Soap", "12", "3", "pcs.", "wash", "Cosmetics, hygiene");
        Assert.assertEquals(f + s + d, app.createList.getCheckPrice());
        app.commonHeler.backButtonTwice();

    }

}
