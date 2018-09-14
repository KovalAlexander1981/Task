package Helpers;

import Pages.CreateList;

public class CreateListHelper extends CreateList {


    public String getListName() {
        return super.getListName();
    }


    public int getCheckPrice(){ return  super.getCheckPrice(); }

    public int addNewproductToList(String goods, String priceGood, String amountGood, String tare, String  comments, String category) {
        return super.addNewproductToList(goods, priceGood, amountGood, tare, comments, category);
    }


}




