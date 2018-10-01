package Tests;


import TestDate.Tare;
import org.testng.Assert;
import org.testng.annotations.Test;


public class AddNewCategoryTest extends BaseTest {
    @Test(description = "Add new category in the products category list")
    public void test10() {
        try {
        Assert.assertEquals(app.homePage.clickButtonSet()
                .addNewCategoryGoods("Categories List", "Alfa")
                .createNewList("Victory", "")
                .addNewProductToList("Cat food", "22", "1", Tare.bottles.name(), "For my kitty", "Alfa"), app.createList.getCheckPrice());
        app.utils.backButtonTwice().deleteList();
        System.out.println("Test10 Add new category in the products category list");}
        catch (NullPointerException e){
            app.settingsPage.backButton();
        }

    }
}