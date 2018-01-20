package com.docljn.scales.Instruments;

/**
 * Created by lornanoble on 20/01/2018.
 */

class Timpani extends Instrument {
    private String pitch;

    public Timpani(String name, double purchasePrice, double sellingPrice, Section section, String description, String pitch) {
        super(name, purchasePrice, sellingPrice, section, description);
        this.pitch = pitch;
    }

    @Override
    public String play() {
        return null;
    }

    public String getPitch() {
        return this.pitch;
    }

    public void setPitch(String pitch) {
        this.pitch = pitch;
    }
}
