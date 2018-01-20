package com.docljn.scales.Instruments;

/**
 * Created by lornanoble on 20/01/2018.
 */

class Clarinet extends Instrument{
    private ReedType reedType;
    private ReedNumber reedNumber;

    public Clarinet(String name, double purchasePrice, double sellingPrice, Section section, String description, ReedType reedType, ReedNumber reedNumber) {
        super(name, purchasePrice, sellingPrice, section, description);
        this.reedType = reedType;
        this.reedNumber = reedNumber;
        this.reedType = reedType;
    }

    @Override
    public String play() {
        return "Duck-like quacking at " + getPlayingVolume()  +"dB";
    }

    public ReedType getReedType() {
        return this.reedType;
    }

    public ReedNumber getReedNumber() {
        return this.reedNumber;
    }

    public double getPlayingVolume(){
        return 80 + 5*getReedNumber().getStrength();
    }


}
