package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class BasePage {
    protected static AppiumDriver<MobileElement> driver;
    protected static WebDriverWait wait;

    static {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "Nexus 5");
        caps.setCapability("udid", "emulator-5554");
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "7.0");
        caps.setCapability("appPackage", "com.slava.buylist");
        caps.setCapability("appActivity", "com.slava.buylist.MainActivity");
        try {
            driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        wait = new WebDriverWait(driver, 10);
    }

    public BasePage() {
        PageFactory.initElements(driver, this);
    }


    public void scroll() {

        Dimension size = driver.manage().window().getSize();
        int x = (int) (size.width * 0.5);
        int y = (int) (size.height * 0.6);
        int endY = (int) (size.height * 0.1);

            new TouchAction(driver)
                    .press(new PointOption().withCoordinates(x, y))
                    .waitAction(new WaitOptions().withDuration(Duration.ofMillis(2500)))
                    .moveTo(new PointOption().withCoordinates(x, endY))
                    .release()
                    .perform();

        }
    protected void tap(double a, double  b) {

      Dimension size = driver.manage().window().getSize();
        int x = (int) (size.width * a);
       int  y = (int) (size.height * b);
        new TouchAction(driver)
                .press(new PointOption().withCoordinates(x, y))
                .waitAction(new WaitOptions().withDuration(Duration.ofMillis(1000)))
                .release()
                .perform();
    }

    }



