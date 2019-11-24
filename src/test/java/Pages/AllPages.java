package Pages;


public class AllPages {

        public HomePage homePage;
        public ResentPage resentPage;
        public NewChatPage newChatPage;
        public NewGroupChatPage newGroupChatPage;
        public ActivityPage activityPage;
        public ChatDetailsPage chatDetailsPage;

    public  AllPages() {
            homePage = new HomePage();
            resentPage = new ResentPage();
            newChatPage = new NewChatPage();
            newGroupChatPage = new NewGroupChatPage();
            activityPage = new ActivityPage();
            chatDetailsPage = new ChatDetailsPage();
        }
    }

