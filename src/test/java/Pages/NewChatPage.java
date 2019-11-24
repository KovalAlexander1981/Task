package Pages;

import io.qameta.allure.Description;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.testng.Assert.assertTrue;

public class NewChatPage {

    @FindBy(id = "com.ekoapp.ekos:id/create_group_avatar_image_view")
    private WebElement newGroupChatButton;

    public NewChatPage() {
        checkIsOpened();
    }

    @Description("Check that page is open")
    private NewChatPage checkIsOpened(){
        assertTrue(newGroupChatButton.isDisplayed(), "Is open element is not displayed");
        return this;
    }

    @Description("Click to button to open New Group Chat")
    public NewGroupChatPage clickGroupChatButton() {
        newGroupChatButton.click();
        return new NewGroupChatPage();
    }

}
