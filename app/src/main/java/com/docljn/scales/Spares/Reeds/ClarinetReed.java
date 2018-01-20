package com.docljn.scales.Spares.Reeds;

import com.docljn.scales.Spares.Spares;

/**
 * Created by lornanoble on 20/01/2018.
 */

public class ClarinetReed extends Spares {
    private ReedType reedType;
    private ReedNumber reedNumber;

    public ClarinetReed(String name, double purchasePrice, double sellingPrice, ReedType reedType, ReedNumber reedNumber) {
        super(name, purchasePrice, sellingPrice);
        this.reedType = reedType;
        this.reedNumber = reedNumber;
    }

    public ReedType getReedType() {
        return this.reedType;
    }


    public ReedNumber getReedNumber() {
        return this.reedNumber;
    }
}
