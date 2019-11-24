package Drivers;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;

public  class DriverFactory {
    protected static AppiumDriver<MobileElement> driver;
    protected static WebDriverWait wait;

       static {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("deviceName", "Nexus 5");
            caps.setCapability("udid", "emulator-5554");
            caps.setCapability("platformName", "Android");
            caps.setCapability("platformVersion", "7.0");
            caps.setCapability("appPackage", "com.ekoapp.ekos");
            caps.setCapability("appActivity", "com.ekoapp.signin.SignInActivity");
            try {
                driver = new AndroidDriver<>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
            wait = new WebDriverWait(driver, 10);
        }

    }








