package Helpers;

import Pages.CreateList;


public class CreateListHelper extends CreateList {


    public String getListName() {
        return super.getListName();
    }


    public int getCheckPrice() {
        return super.getCheckPrice();
    }

    public int addNewproductToList(String goods, String priceGood, String amountGood, String Tare, String comments, String category) {
        return super.addNewproductToList(goods, priceGood, amountGood, Tare, comments, category);
    }

    public void addNewproductToList(String goods) {
        super.addNewproductToList(goods);
    }

    public String addNewproductToList(String goods, String priceGood) {

        return super.addNewproductToList(goods, priceGood);
    }

    public String getCurrency() {
        return super.getCurrency();

    }

    public String getComents() {
        return super.getComents();

    }

    public String getAmount() {
        return super.getAmount();
    }

    public String getPrice() {
        return super.getPrice();

    }

    public boolean checkElement(String element) {
        return super.checkElement(element);
    }
}




