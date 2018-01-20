package com.docljn.scales.Spares;

/**
 * Created by lornanoble on 20/01/2018.
 */

public class Seat extends Spares {
    private int height;
    private boolean adjustable;

    public Seat(String name, double purchasePrice, double sellingPrice, int heightInCentimeters, boolean adjustable) {
        super(name, purchasePrice, sellingPrice);
        this.height = height;
        this.adjustable = adjustable;
    }

    public int getHeight() {
        return this.height;
    }

    public boolean isAdjustable() {
        return this.adjustable;
    }
}
