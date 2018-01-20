package com.docljn.scales.Instruments;


/**
 * Created by lornanoble on 20/01/2018.
 */

public class Horn extends Instrument {

    public Horn(String name, double purchasePrice, double sellingPrice, Section section, String description) {
        super(name, purchasePrice, sellingPrice, section, description);
    }


    @Override
    public String play() {
        return "Hoot hoot";
    }
}
