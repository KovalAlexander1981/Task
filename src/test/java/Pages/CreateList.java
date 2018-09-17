package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static java.lang.Integer.parseInt;

public class CreateList extends BasePage{


    @FindBy(id = "com.slava.buylist:id/editText1")
    private WebElement textGoods;

	@FindBy(id = "com.slava.buylist:id/textView1")
	private WebElement listName;

	@FindBy(id = "com.slava.buylist:id/editText1")
	private WebElement textFieldProductName;

	@FindBy(id = "com.slava.buylist:id/editText2")
	private WebElement numberFieldPrice;

	@FindBy(id = "com.slava.buylist:id/value")
	private WebElement currency;

	@FindBy(id = "com.slava.buylist:id/editText3")
	private WebElement numberFieldAmount;

	@FindBy(id = "com.slava.buylist:id/spinner1")
	private WebElement dporTare;

	@FindBy(id = "com.slava.buylist:id/editText4")
	private WebElement commentsField;

    @FindBy(id = "com.slava.buylist:id/spinner2")
    private WebElement dropCategory;

	@FindBy(id = "com.slava.buylist:id/button2")
	private WebElement addProduct;

	@FindBy(id = "com.slava.buylist:id/textView2")
	private WebElement listPrice;




    protected String getListName(){
        return  listName.getText();
    }

    protected int addNewproductToList(String goods, String priceGood, String amountGood, String tare, String  comments, String category) {
        int price_good = parseInt(amountGood) * parseInt(priceGood);
        textFieldProductName.sendKeys(goods);
        numberFieldPrice.sendKeys(priceGood);
        numberFieldAmount.sendKeys(amountGood);
        dporTare.click();
        driver.findElementByXPath("//android.widget.CheckedTextView[@text='" + tare + "']").click();
        commentsField.sendKeys(comments);
        dropCategory.click();
        driver.findElementByXPath("//android.widget.CheckedTextView[@text='" + category + "']").click();
        addProduct.click();
        return price_good;
    }
    protected void addNewproductToList(String goods) {
        textFieldProductName.sendKeys(goods);
        addProduct.click();
    }



    protected int getCheckPrice(){
    return  parseInt(listPrice.getText().replaceAll("[^0-9]+", ""));

        }
}




