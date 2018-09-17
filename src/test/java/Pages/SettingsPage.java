package Pages;

import Helpers.CommonHeler;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.util.HashMap;
import java.util.List;



public class SettingsPage extends BasePage {


	@FindBys(@FindBy(id = "android:id/title"))
	private List<WebElement> categorySettings;

	@FindBys(@FindBy(id = "android:id/text1"))
	private List<WebElement> currencyList;

	@FindBy(id = "com.slava.buylist:id/button2")
	private WebElement btnAddCategory;

	@FindBy(className = "android.widget.EditText")
	private WebElement texttNameCategory;

	@FindBy(id = "android:id/button1")
	private WebElement btnOk;

	@FindBys(@FindBy(id = "com.slava.buylist:id/title"))
	private List<WebElement> listCategory;


	protected void setCategory(String name) {
		for (int i = 0; i < categorySettings.size(); i++) {
			String d = categorySettings.get(i).getText();

			if (name.equals(d))
				categorySettings.get(i).click();
		}
	}

	protected void setCurrency(String currency) {
		for (int i = 0; i < currencyList.size(); i++) {
			String d = currencyList.get(i).getText();
			if (currency.equals(d))
				currencyList.get(i).click();
		}
	}

	protected boolean setCategoryGood(String name) {
		btnAddCategory.click();
		texttNameCategory.sendKeys(name);
		btnOk.click();
		scroll();
		scroll();
		boolean f = false;
		for (int i = 0; i < listCategory.size(); i++) {
			String d = listCategory.get(i).getText();
			if (name.equals(d)) {
				f = true;
			}
		}
		return f;

	}

	public void scroll(){
		super.scroll();
	}

	}














