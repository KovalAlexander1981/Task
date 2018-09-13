package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DeleteListTest extends BaseTest{

   @Test(priority = 3, description = "Delete list")
   public void deleteList ()  {
       int amountBefore = app.homePage.listArray();
       System.out.println(amountBefore);
       app.homePage.deleteList();
       Assert.assertEquals((amountBefore-1), app.homePage.listArray());

   }

}
