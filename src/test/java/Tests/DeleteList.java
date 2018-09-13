package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DeleteList extends BaseTest{

   @Test(description = "Delete list")
   public void deleteList ()  {
       app.homePage.deleteList();
       Assert.assertEquals(app.createList.getListName(), "Rambo");

   }

}
