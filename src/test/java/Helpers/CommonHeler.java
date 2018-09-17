package Helpers;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

import Pages.BasePage;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;

import java.time.Duration;
import java.util.HashMap;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofMillis;

public class CommonHeler extends BasePage {

    public  void stopApp(){ driver.closeApp(); }

    public  void backButtonTwice() {
        ((AndroidDriver) driver).pressKeyCode(AndroidKeyCode.BACK);
        ((AndroidDriver) driver).pressKeyCode(AndroidKeyCode.BACK);
    }

    public  void backButton() {
        ((AndroidDriver) driver).pressKeyCode(AndroidKeyCode.BACK);
        ((AndroidDriver) driver).pressKeyCode(AndroidKeyCode.BACK);
    }




    }

