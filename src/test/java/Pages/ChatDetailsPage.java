package Pages;

import io.qameta.allure.Description;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static Helpers.Utils.*;

import static org.testng.Assert.assertTrue;

public class ChatDetailsPage extends BasePage{

    @FindBy(id = "com.ekoapp.ekos:id/create_group_avatar_image_view")
    private WebElement newGroupChatButton;

    @FindBy(id = "com.ekoapp.ekos:id/group_detail_leave_chat_textview")
    private WebElement leaveChatLink;

    @FindBy(id = "android:id/button1")
    private WebElement okButton;

    public ChatDetailsPage() {
        checkIsOpened();
    }

    @Description("Check that page is open")
    private ChatDetailsPage checkIsOpened(){
        assertTrue(newGroupChatButton.isDisplayed(), "Is open element is not displayed");
        return this;
    }

    @Description("Click leave chat link")
    public ResentPage clickLeaveChat() {
        scroll();
        scroll();
        leaveChatLink.click();
        okButton.click();
        return new ResentPage();
    }
}
