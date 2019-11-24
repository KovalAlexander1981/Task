package Pages;

import io.qameta.allure.Description;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import static org.testng.Assert.assertTrue;

public class NewGroupChatPage {
    @FindBy(id = "com.ekoapp.ekos:id/contact_name_text_view")
    List <WebElement>  usersNameText;

    @FindBy(id = "com.ekoapp.ekos:id/contact_checkbox")
    List <WebElement>  usersNameCheckbox;

    @FindBy(id = "com.ekoapp.ekos:id/group_chat_next_button")
    private WebElement nextButton;

    @FindBy(id = "com.ekoapp.ekos:id/group_chat_name_text_view")
    private WebElement chatNameTextField;

    @FindBy(id = "com.ekoapp.ekos:id/workspace_create_closed_workspace_switch")
    private WebElement createChatButton;

    public NewGroupChatPage() {
        checkIsOpened();
    }

    @Description("Check that page is open")
    private NewGroupChatPage checkIsOpened(){
        assertTrue(nextButton.isDisplayed(), "Is open element is not displayed");
        return this;
    }

    @Description("Chose user from the list")
    public NewGroupChatPage addUserToGroup (String name) {
        for(int i = 0; i < usersNameText.size(); i++) {
            if (usersNameText.get(i).getText().equals(name)) {
                usersNameCheckbox.get(i).click();
            }
        }
        return new NewGroupChatPage();
    }

    @Description("Enter chat name {0}")
    public NewGroupChatPage enterChatName (String chatName) {
        chatNameTextField.click();
        chatNameTextField.sendKeys(chatName);
        return this;
    }

    @Description("Click create chat button")
    public void clickCreateChat(){
        createChatButton.click();
    }
}
