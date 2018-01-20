package com.docljn.scales.Instruments;

/**
 * Created by lornanoble on 20/01/2018.
 */

enum ReedNumber {
    ONE(1),
    ONE_POINT_FIVE(1.5),
    TWO(2),
    TWO_POINT_FIVE(2.5),
    THREE(3),
    THREE_POINT_FIVE(3.5),
    FOUR(4),
    FOUR_POINT_FIVE(4.5),
    FIVE(5);

    private double strength;

    ReedNumber(double strength) {
        this.strength = strength;
    }

    public double getStrength(){
        return this.strength;
    }
}
