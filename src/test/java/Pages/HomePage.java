package Pages;

import io.qameta.allure.Description;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.testng.Assert.assertTrue;

import java.util.List;

public class HomePage extends BasePage {

    @FindBy(id = "com.ekoapp.ekos:id/login_username_edittext")
    private WebElement userNameTextField;

    @FindBy(id = "com.ekoapp.ekos:id/login_password_edittext")
    private WebElement userPasswordTextField;

    @FindBy(id = "com.ekoapp.ekos:id/text")
    private WebElement regionSelectButton;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView")
    List <WebElement> regionsSelect;

    @FindBy(id = "com.ekoapp.ekos:id/button")
    private WebElement signInButton;

    @FindBy(id = "com.ekoapp.ekos:id/login_reset_password_textview")
    private WebElement forgotPasswordLink;

    @FindBy(id = "com.ekoapp.ekos:id/view_onboarding_forward")
    private WebElement clickNextOnWelcomeWidget;

    @FindBy(id = "com.ekoapp.ekos:id/view_onboarding_dialog_button")
    private WebElement getStartedButton;

    public final static String EUROPE = "Europe";
    public final static String SOUTHEAST_ASIA = "Southeast Asia";
    public final static String NORTH_AMERICA = "North America";

    public HomePage() {
        checkIsOpened();
    }

    @Description("Check that page is open")
    private HomePage checkIsOpened(){
       assertTrue(forgotPasswordLink.isDisplayed(), "Is open element is not displayed");
       assertTrue(userNameTextField.isDisplayed(), "Is open element is not displayed");
       assertTrue(userPasswordTextField.isDisplayed(), "Is open element is not displayed");

        return this;
    }

    @Description("Enter user password {0},  login {1}, region {2}")
    public HomePage enterLogInUserInformation (String login, String password, String region){
        userNameTextField.clear();
        userNameTextField.sendKeys(login);
        userPasswordTextField.click();
        userPasswordTextField.sendKeys(password);
        for(WebElement regionFromList : regionsSelect) {
            if(regionFromList.getText().equals(region))
                regionFromList.click();
        }
        return new HomePage();
    }

    @Description("Click Sign In button")
    public ResentPage clickSignInButton () {
        signInButton.click();
        while (clickNextOnWelcomeWidget.isDisplayed()){
            clickNextOnWelcomeWidget.click();
        }
        if(getStartedButton.isDisplayed()){
            getStartedButton.click();
        }
        return new ResentPage();
    }
}



