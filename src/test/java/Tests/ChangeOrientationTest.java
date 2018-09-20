package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;


public class ChangeOrientationTest extends BaseTest {
    @Test(priority = 9, description = "Change the App orientation")

    public void test11() {
        app.homePage.clickButtonSet();
        app.settingsPage.ChangeOrientation("Horizontal");
        app.commonHeler.backButton();
        app.homePage.createNewList("Wow", "Horizontal");
        app.createList.addNewproductToList("Cat food", "Horizontal", 0);
        Assert.assertEquals("Wow", app.createList.getListName());
        Assert.assertEquals("Cat food", app.createList.getNameGood());
        System.out.println("Test11 Change the App orientation");
    }
}