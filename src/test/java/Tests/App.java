package Tests;

import Helpers.Utils;
import Pages.CreateList;
import Pages.HomePage;
import Pages.SettingsPage;

public class App {
    public HomePage homePage;
    public CreateList createList;
    public Utils utils;
    public SettingsPage settingsPage;

    public App() {
        homePage = new HomePage();
        createList = new CreateList();
        utils = new Utils();
        settingsPage = new SettingsPage();
    }
}
