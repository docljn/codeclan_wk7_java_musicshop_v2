package com.docljn.scales.Spares;

<<<<<<< HEAD
=======

import com.docljn.scales.StockItem;

>>>>>>> fromV1
/**
 * Created by lornanoble on 20/01/2018.
 */

<<<<<<< HEAD
public class Seat extends Spares {
    private int height;
    private boolean adjustable;

    public Seat(String name, double purchasePrice, double sellingPrice, int heightInCentimeters, boolean adjustable) {
=======
public class Seat extends StockItem {
    private int height;
    private boolean adjustable;

    public Seat(String name, double purchasePrice, double sellingPrice, int height, boolean adjustable) {
>>>>>>> fromV1
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
