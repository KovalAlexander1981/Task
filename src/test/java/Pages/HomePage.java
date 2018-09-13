package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.util.List;

public class HomePage extends BasePage{


    @FindBy(id = "com.slava.buylist:id/button1")
	private WebElement btnPreferences;

	@FindBy(id="com.slava.buylist:id/editText1")
	private WebElement textField;

    @FindBy(id="com.slava.buylist:id/button2")
    private WebElement btnAdd;

    @FindBy(id="com.slava.buylist:id/imageView2")
    private WebElement btnEdit;

	@FindBy(id = "com.slava.buylist:id/title")
	private WebElement listName;

	@FindBy(id = "com.slava.buylist:id/str1")
	private WebElement listInfo;

	@FindBy(id = "com.slava.buylist:id/imageView1")
	private WebElement listDelete;

	@FindBy(id = "android:id/button1")
	private WebElement deleteYes;

    @FindBy(id = "android:id/button2")
    private WebElement deleteNo;

	@FindBys(@FindBy(id = "com.slava.buylist:id/title"))
    private List<WebElement> listLists;


	//@FindBy(id = "com.slava.buylist:id/title")
	//public WebElement listLists;


public int listArray(){
    return listLists.size();
}






    public CreateList createNewList(String listName){
        textField.sendKeys(listName);
        btnAdd.click();
        return new CreateList();
    }

    public void  deleteList(){
        listDelete.click();
        deleteYes.click();

    }

}
