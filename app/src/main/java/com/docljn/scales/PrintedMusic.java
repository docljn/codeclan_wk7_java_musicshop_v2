package com.docljn.scales;

/**
 * Created by lornanoble on 19/01/2018.
 */

class PrintedMusic implements Sellable {

    private final String name;
    private double sellingPrice;
    private double purchasePrice;

    public PrintedMusic(String name, double purchasePrice, double sellingPrice) {
        this.name = name;
        this.purchasePrice = purchasePrice;
        this.sellingPrice = sellingPrice;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public double getSellingPrice() {
        return this.sellingPrice;
    }

    @Override
    public double getPurchasePrice() {
        return this.purchasePrice;
    }




}
