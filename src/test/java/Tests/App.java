package Tests;

import Helpers.CommonHeler;
import Helpers.CreateListHelper;
import Helpers.HomePageHelper;

public class App {
  public HomePageHelper homePage;
  public CreateListHelper createList;
  public CommonHeler commonHeler;

    public App() {
        homePage =  new HomePageHelper();
        createList = new CreateListHelper();
        commonHeler = new CommonHeler();
    }
}
