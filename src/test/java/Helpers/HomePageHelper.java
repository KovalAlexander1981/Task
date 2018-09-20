package Helpers;

import Pages.CreateList;
import Pages.HomePage;

public class HomePageHelper extends HomePage {

    public CreateList createNewList(String listName, String orientation) {
        return super.createNewList(listName, orientation);
    }


    public void deleteList() {
        super.deleteList();
    }

    public boolean findList(String name) {
        return super.findList(name);
    }


    public void listRename(String newNameList) {
        super.listRename(newNameList);
    }

    public String infoList() {

        return super.infoList();
    }

    public void openList(String name) {
        super.openList(name);

    }

    public void clickButtonSet() {
        super.clickButtonSet();
    }

    public void exitfromApp(){
       super.exitfromApp();
    }

    public int listArray() {
        return super.listArray();
    }

}

