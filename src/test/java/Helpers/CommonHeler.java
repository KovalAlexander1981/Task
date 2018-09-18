package Helpers;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

import Pages.BasePage;


public class CommonHeler extends BasePage {

    public void stopApp() {
        driver.closeApp();
    }

    public void backButtonTwice() {
        ((AndroidDriver) driver).pressKeyCode(AndroidKeyCode.BACK);
        ((AndroidDriver) driver).pressKeyCode(AndroidKeyCode.BACK);
    }

    public void backButton() {
        ((AndroidDriver) driver).pressKeyCode(AndroidKeyCode.BACK);
        ((AndroidDriver) driver).pressKeyCode(AndroidKeyCode.BACK);
    }


}

