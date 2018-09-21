package Tests;


import Pages.Tare;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.annotations.Test;


public class AddNewCategoryTest extends BaseTest {
    @Test(priority = 9, description = "Add new category in the products category list")
    public void test10(){
        app.homePage.clickButtonSet();
        app.homePage.scroll();
        try {
            app.homePage.scroll();
            app.settingsPage.setCategory("Categories List");
        } catch (NoSuchElementException ex) {
            app.homePage.scroll();
            app.settingsPage.setCategory("Categories List");
        }
        boolean d = app.settingsPage.setCategoryGood("Alfa");
        Assert.assertTrue(d);
        app.commonHeler.backButtonTwice();
       app.commonHeler.backButton();
        app.homePage.createNewList("Victory", "");
        int u = app.createList.addNewproductToList("Cat food", "22", "1", Tare.bottles.name(), "For my kitty", "Alfa");
        Assert.assertEquals(u, app.createList.getCheckPrice());
        app.commonHeler.backButtonTwice();
        app.homePage.deleteList();
        System.out.println("Test10 Add new category in the products category list");

    }
}