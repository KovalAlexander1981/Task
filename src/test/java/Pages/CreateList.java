package Pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateList extends BasePage{


    @FindBy(id = "com.slava.buylist:id/editText1")
    private WebElement textGoods;

	@FindBy(id = "com.slava.buylist:id/textView1")
	private WebElement listName;



    public String getListName(){
        return  listName.getText();

    }





}
