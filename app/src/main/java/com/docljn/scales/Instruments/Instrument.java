package com.docljn.scales.Instruments;


import com.docljn.scales.StockItem;

/**
 * Created by lornanoble on 19/01/2018.
 */

public class Instrument extends StockItem {
    Enum<Section> section;



    public Instrument(String name, double purchasePrice, double sellingPrice, Section section) {
        super(name, purchasePrice, sellingPrice);
        this.section = section;
    }
}
