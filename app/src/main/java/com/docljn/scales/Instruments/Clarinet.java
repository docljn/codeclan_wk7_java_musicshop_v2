package com.docljn.scales.Instruments;

import com.docljn.scales.Spares.Reeds.ClarinetReed;
import com.docljn.scales.Spares.Reeds.ReedNumber;
import com.docljn.scales.Spares.Reeds.ReedType;

/**
 * Created by lornanoble on 20/01/2018.
 */

class Clarinet extends Instrument{
    private final ClarinetReed reed;

    public Clarinet(String name, double purchasePrice, double sellingPrice, Section section, String description) {
        super(name, purchasePrice, sellingPrice, section, description);
        this.reed = new ClarinetReed("Yamaha", 0, 0, ReedType.E_FLAT, ReedNumber.TWO);

    }

    @Override
    public String play() {
        return "Duck-like quacking at " + getPlayingVolume()  +"dB";
    }

    public ReedType getReedType() {
        return this.reed.getReedType();
    }

    public ReedNumber getReedNumber() {
        return this.reed.getReedNumber();
    }

    public double getPlayingVolume(){
        return 80 + 5*getReedNumber().getStrength();
    }


}
