package Pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import static java.lang.Integer.parseInt;

public class CreateList extends BasePage {


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

    @FindBy(id = "com.slava.buylist:id/str1")
    private WebElement textCommentary;

    @FindBy(id = "com.slava.buylist:id/TextView01")
    private WebElement textAmount;

    @FindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.TextView[4]")
    private WebElement textPrice;

    @FindBy(id = "com.slava.buylist:id/title")
    private WebElement getNameGood;


    protected String getNameGood() {
        return getNameGood.getText();
    }

    protected String getListName() {
        return listName.getText();
    }

    protected int addNewproductToList(String goods, String priceGood, String amountGood, String Tare, String comments, String category) {
        int price_good = parseInt(amountGood) * parseInt(priceGood);
        textFieldProductName.sendKeys(goods);
        numberFieldPrice.sendKeys(priceGood);
        numberFieldAmount.sendKeys(amountGood);
        dporTare.click();
        driver.findElementByXPath("//android.widget.CheckedTextView[@text='" + Tare + "']").click();
        commentsField.sendKeys(comments);
        dropCategory.click();
        driver.findElementByXPath("//android.widget.CheckedTextView[@text='" + category + "']").click();
        addProduct.click();
        return price_good;
    }

    public void addNewproductToList(String goods, String orientation, int a) {
        textFieldProductName.sendKeys(goods);
        if ("Horizontal".equals(orientation)) {
            for (int i = 0; i < 3; i++) {
                tap(0.85, 0.19);
            }
            addProduct.click();
        } else {
            addProduct.click();
        }
    }

    protected String addNewproductToList(String goods, String priceGood) {
        textFieldProductName.sendKeys(goods);
        String d = currency.getText();
        numberFieldPrice.sendKeys(priceGood);
        addProduct.click();
        return d;
    }

    protected int getCheckPrice() {
        return parseInt(listPrice.getText().replaceAll("[^0-9]+", ""));
    }

    protected String getCurrency() {
        return listPrice.getText();
    }

    protected String getComents() {
        return textCommentary.getText();

    }

    protected String getAmount() {
        return textAmount.getText();

    }

    protected String getPrice() {
        return textPrice.getText();

    }

    protected boolean checkElement(String element) {
        boolean b = false;
        try {
            driver.findElementByXPath("//*[@text='" + element + "']").click();
        } catch (NoSuchElementException ex) {
            b = true;
        }
        return b;
    }

}




