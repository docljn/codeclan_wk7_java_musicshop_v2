package com.docljn.scales;

import java.util.ArrayList;

/**
 * Created by lornanoble on 19/01/2018.
 */

class Shop {

    private String shopName;
    private ArrayList<Sellable> stock;
    private double cashCount;

    public Shop(String shopName) {
        this.shopName = shopName;
        this.cashCount = 0.00;
        this.stock = new ArrayList<>();
    }

    public String getName() {
        return this.shopName;
    }

    public double getCashCount() {
        return this.cashCount;
    }

    public int getStockCount() {
        return this.stock.size();
    }



    public void buy(Sellable stockItem) {
//        TODO: add a source for the money used to buy stock that isn't the cash count!
        this.stock.add(stockItem);
    }

    public void sell(Sellable stockItem) {

        if(inStock(stockItem)) {

            this.cashCount += stockItem.getSellingPrice();
            this.stock.remove(stockItem);
        }
    }

    private boolean inStock(Sellable stockItem) {
        return this.stock.contains(stockItem);
    }


    public double getMarkup(Sellable stockItem) {
        return stockItem.getSellingPrice() - stockItem.getPurchasePrice();
    }
}
