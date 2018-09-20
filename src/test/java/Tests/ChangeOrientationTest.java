package Tests;

import Pages.Tare;
import org.testng.Assert;
import org.testng.annotations.Test;


public class ChangeOrientationTest extends BaseTest {
    @Test(priority = 9, description = "Change the App orientation")

    public void test11() {
        app.homePage.clickButtonSet();
        app.settingsPage.ChangeOrientation("Horizontal");
        app.commonHeler.backButton();
        app.homePage.createNewList("Wow", "Horizontal");

        int f = app.createList.addNewproductToList("Cat food", "22", "1", Tare.pack.name(), "For my kitty", "Pet products");
      //  Assert.assertEquals(f, app.createList.getCheckPrice());
        app.commonHeler.backButtonTwice();
        System.out.println("Test11 Change the App orientation");
    }
}