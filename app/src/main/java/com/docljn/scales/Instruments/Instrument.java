package com.docljn.scales.Instruments;

import com.docljn.scales.Sellable;

/**
 * Created by lornanoble on 19/01/2018.
 */

public class Instrument implements Sellable {
    String name;
    Enum<Section> section;
    double purchasePrice;
    double sellingPrice;

    public Instrument(String name, Section section, double purchasePrice, double sellingPrice){
        this.name = name;
        this.section = section;
        this.purchasePrice = purchasePrice;
        this.sellingPrice = sellingPrice;
    }

    @Override
    public double getSellingPrice() {
        return this.sellingPrice;
    }

    @Override
    public double getPurchasePrice() {
        return this.purchasePrice;
    }

    public String getName() {
        return this.name;
    }
}
