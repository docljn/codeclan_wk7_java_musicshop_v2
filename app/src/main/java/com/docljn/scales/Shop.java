package com.docljn.scales;

import java.util.ArrayList;

/**
 * Created by lornanoble on 19/01/2018.
 */

class Shop {

    private String shopName;
    private ArrayList<Sellable> stock;

    public Shop(String shopName) {
        this.shopName = shopName;
        this.stock = new ArrayList<>();
    }

    public Object getName() {
        return this.shopName;
    }

    public int getStockCount() {
        return this.stock.size();
    }

    public void buy(Sellable stockItem) {
        this.stock.add(stockItem);
    }

    public void sell(Sellable stockItem) {
        this.stock.remove(stockItem);
    }
}
