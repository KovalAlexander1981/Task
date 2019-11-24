package Pages;

import static Helpers.Utils.*;
import io.qameta.allure.Description;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class ActivityPage extends BasePage {

    @FindBy(id = "com.ekoapp.ekos:id/toolbar_title_textview")
    private WebElement actityNameTitle;

    @FindBy(id = "com.ekoapp.ekos:id/sticker_icon")
    private WebElement sticerIkonIPanel;

    @FindBy(id = "com.ekoapp.ekos:id/image_icon")
    private WebElement imageIconInPanel;

    @FindBy(id = "com.ekoapp.ekos:id/messageEditText")
    private WebElement textField;

    @FindBy(xpath = "//android.view.ViewGroup/android.widget.ImageView")
    private WebElement sendMessageButton;

    @FindBy(id = "com.ekoapp.ekos:id/message")
    List<WebElement> messagesTextOnChat;

    @FindBy(id = "com.ekoapp.ekos:id/image")
    List<WebElement> imagesOnChat;

    @FindBy(id = "com.ekoapp.ekos:id/sticker")
    List<WebElement> stickerOnChat;

    @FindBy(id = "com.ekoapp.ekos:id/view_sticker_item_image")
    List<WebElement> iconsList;

    @FindBy(id = "com.ekoapp.ekos:id/check_view")
    List<WebElement> pictureList;

    @FindBy(id = "com.ekoapp.ekos:id/sticker_container")
    List<WebElement> stickerList;

    @FindBy(id = "com.ekoapp.ekos:id/button_apply")
    private WebElement selectButton;

    @FindBy(id = "com.ekoapp.ekos:id/multiple_image_send_button")
    private WebElement sendButton;

    @FindBy(id = "com.ekoapp.ekos:id/action_topic_list")
    private WebElement createNewTopicButton;

    @FindBy(id = "com.ekoapp.ekos:id/view_new_compose_view_topic_name")
    private WebElement topicNameTextField;

    @FindBy(id = "com.ekoapp.ekos:id/button")
    private WebElement createNewTopiicbutton;

    @FindBy(id = "com.ekoapp.ekos:id/toolbar_title_textview")
    private WebElement topicNameTextLabel;

    @FindBy(id = "com.ekoapp.ekos:id/toolbar_title_textview")
    private WebElement topicChatNameTextLabel;

    @FindBy(id ="Navigate up")
    private WebElement closeChat;

    public ActivityPage() {
        checkIsOpened();
    }

    @Description("Check that page is open")
    private ActivityPage checkIsOpened(){
        assertTrue(actityNameTitle.isDisplayed(), "Is open element is not displayed");
        return this;
    }

    @Description("Send message {0} and checked it in the chat")
    public ActivityPage sendMessageAndChecked(String message){
        textField.click();
        textField.sendKeys(message);
        sendMessageButton.click();
        assertEquals(message, messagesTextOnChat.get(messagesTextOnChat.size()-1).getText(), "Message is not present on chat");
        return this;
    }

    @Description("Send first photo and checked it in the chat")
    public ActivityPage sendPhotoAndChecked(){
        imageIconInPanel.click();
        pictureList.get(0).click();
        selectButton.click();
        sendButton.click();
        try {
            wait(2000);
        } catch (InterruptedException e) {
            e.getMessage();
        }
        assertTrue(imagesOnChat.get(imagesOnChat.size()-1).isDisplayed(), "Image is not present on the chat");
        return this;
    }

    @Description("Send first sticker and checked it in the chat")
    public ActivityPage sendStickerAndChecked(String activity){
        sticerIkonIPanel.click();
        stickerList.get(0).click();
        stickerList.get(0).click();
        backButton();
        new ResentPage().openRecentActivity(activity);
        assertTrue(stickerOnChat.get(stickerOnChat.size()-1).isDisplayed(), "Sticker is not present on the chat");
        return this;
    }

    @Description("Create new topic with name{0}")
    public ActivityPage createNewTopic(String topicName) {
        createNewTopicButton.click();
        topicNameTextField.click();
        topicNameTextField.sendKeys(topicName);
        createNewTopicButton.click();
        return new ActivityPage();
    }

    @Description("Check Topic {0} and Chat {1} names")
    public ActivityPage checkTopicAndChatName(String chatName, String topicName) {
        assertEquals(topicChatNameTextLabel.getText(), chatName, "Chat name is not present or has wrong name");
        assertEquals(topicNameTextLabel.getText(), topicName, "Topic name is not present or has wrong name");
        return this;
    }

    @Description("Close chat")
    public ActivityPage clickCloseChat() {
        closeChat.click();
        closeChat.click();
        return new ActivityPage();
    }

    public ChatDetailsPage openChatDetailsPage() {
        actityNameTitle.click();
        return new ChatDetailsPage();
    }
}
