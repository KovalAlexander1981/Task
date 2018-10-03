package Pages;

public class AllPages {


        public static HomePage homePage;
        public static  CreateList createList;
        public static  SettingsPage settingsPage;

        public  AllPages() {
            homePage = new HomePage();
            createList = new CreateList();
            settingsPage = new SettingsPage();
        }
    }

