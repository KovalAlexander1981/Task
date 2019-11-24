package Tests;

import Pages.HomePage;
import org.testng.annotations.Test;

import java.util.ResourceBundle;

public class CheckChatTest extends BaseTest {
    @Test(description = "Create new chat, topic add users to  them and leave chat")
    public void checkCreateNewChatWithUsers () {
        String password = String.valueOf(ResourceBundle.getBundle("user.password"));
        String login = String.valueOf(ResourceBundle.getBundle("user.login"));
        String chatName = "Engineer";

        app.homePage
                .enterLogInUserInformation(login, password, HomePage.SOUTHEAST_ASIA)
                .clickSignInButton()
                .clickPlusButton()
                .choseEventFromList("Chat");

        app.newChatPage
                .clickGroupChatButton()
                .enterChatName(chatName)
                .addUserToGroup("Narongsak")
                .addUserToGroup("Sakulchaikeaw")
                .clickCreateChat();

        app.resentPage
                .checkActivityPresent(chatName)
                .openRecentActivity(chatName)
                .sendMessageAndChecked("Hello")
                .sendPhotoAndChecked()
                .sendStickerAndChecked(chatName)
                .createNewTopic("House")
                .checkTopicAndChatName(chatName, "House")
                .clickCloseChat()
                .openChatDetailsPage()
                .clickLeaveChat()
                .checkActivityIsNotPresent(chatName);
    }

}
