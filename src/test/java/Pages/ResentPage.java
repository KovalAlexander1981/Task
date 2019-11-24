package Pages;

import io.qameta.allure.Description;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class ResentPage {

    @FindBy(id = "com.ekoapp.ekos:id/createButton")
    private WebElement plusButton;

    @FindBy(id = "com.ekoapp.ekos:id/chatSheet")
    private WebElement addChatLink;

    @FindBy(id = "com.ekoapp.ekos:id/workflowSheet")
    private WebElement addWorkFlowLink;

    @FindBy(id = "com.ekoapp.ekos:id/formsSheet")
    private WebElement addFormsLink;

    @FindBy(id = "com.ekoapp.ekos:id/taskSheet")
    private WebElement addTaskLink;

    @FindBy(id = "com.ekoapp.ekos:id/broadcastSheet")
    private WebElement addBroadCastLink;

    @FindBy(id = "com.ekoapp.ekos:id/broadcastSheet")
    private WebElement clickPlusButton;

    @FindBy(xpath = "com.ekoapp.ekos:id/title")
    List<WebElement> headlineTextsRecentActivity;

    public ResentPage() {
        checkIsOpened();
    }

    @Description("Check that page is open")
    private ResentPage checkIsOpened(){
        assertTrue(plusButton.isDisplayed(), "Is open element is not displayed");
        return this;
    }

    @Description("Click plus button")
    public ResentPage clickPlusButton (){
        plusButton.click();
        return this;
    }

    @Description("Chose one event from and click on it")
    public void choseEventFromList (String event) {
        switch (event) {
            case ("Chat"):
                addChatLink.click();
                break;
            case ("Workflow"):
                addWorkFlowLink.click();
                break;
            case ("Forms"):
                addFormsLink.click();
                break;
            case ("Task"):
                addTaskLink.click();
                break;
            case ("Broadcast"):
                addBroadCastLink.click();
                break;
            default:
                new Exception("Unsupported event");
                break;
        }
    }

    @Description("Open resent activity with name {0}")
    public ActivityPage openRecentActivity (String activity){
        for (WebElement active : headlineTextsRecentActivity) {
            if (active.getText().equals(activity)) {
                active.click();
            }
        }
        return  new ActivityPage();
    }

    @Description("Check activity with name {0} is present")
    public ResentPage checkActivityPresent(String nameActivity) {
        assertEquals(headlineTextsRecentActivity.get(0).getText(), nameActivity, "Activity is not present on the chat box");
        return this;
    }

    @Description("Check activity with name {0} is not present")
    public ResentPage checkActivityIsNotPresent(String nameActivity) {
        assertTrue(!headlineTextsRecentActivity.get(0).getText().equals(nameActivity), "Activity is present on the chat box");
        return this;
    }
}
