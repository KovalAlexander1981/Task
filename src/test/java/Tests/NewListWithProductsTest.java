package Tests;

import Pages.Tare;
import org.testng.Assert;
import org.testng.annotations.Test;


public class NewListWithProductsTest extends BaseTest {

    @Test(priority = 4, description = "Create new list with products")
    public void test4() {
        app.homePage.createNewList("Happy Friday");
        int f = app.createList.addNewproductToList("Cat food", "22", "1", Tare.pack.name(), "For my kitty", "Pet products");
        int s = app.createList.addNewproductToList("Milk", "18", "1", Tare.l.name(), "i like milk", "Dairy produce");
        int d = app.createList.addNewproductToList("Soap", "12", "3", Tare.g.name(), "wash", "Cosmetics, hygiene");
        Assert.assertEquals(f + s + d, app.createList.getCheckPrice());
        app.commonHeler.backButtonTwice();
        System.out.println("Test4 Create new list with products");


    }

}
