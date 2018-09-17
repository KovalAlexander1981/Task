package Tests;

import Helpers.CommonHeler;
import Helpers.CreateListHelper;
import Helpers.HomePageHelper;
import Helpers.SettingsPageHelper;

public class App {
  public HomePageHelper homePage;
  public CreateListHelper createList;
  public CommonHeler commonHeler;
  public SettingsPageHelper settingsPage;

    public App() {
        homePage =  new HomePageHelper();
        createList = new CreateListHelper();
        commonHeler = new CommonHeler();
        settingsPage = new SettingsPageHelper();
    }
}
