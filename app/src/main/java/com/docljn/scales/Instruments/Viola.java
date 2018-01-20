package com.docljn.scales.Instruments;

/**
 * Created by lornanoble on 20/01/2018.
 */

class Viola extends Instrument {
    private final String stringTuning;

    public Viola(String name, double purchasePrice, double sellingPrice, Section section, String description, String stringTuning) {
        super(name, purchasePrice, sellingPrice, section, description);
        this.stringTuning = stringTuning;
    }

    @Override
    public String play() {
        return "Mellow bowed strings";
    }

    public String getStringTuning() {
        return stringTuning;
    }
}
