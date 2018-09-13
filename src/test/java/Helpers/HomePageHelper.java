package Helpers;

import Pages.CreateList;
import Pages.HomePage;

public class HomePageHelper extends HomePage {

    public CreateList createNewList(String listName) {
        return super.createNewList(listName); }


    public void  deleteList() {
        super.deleteList();
    }

    public int listArray(){
        return super.listArray();
    }


    public void listRename(String newNameList){
        super.listRename(newNameList);
    }

}

