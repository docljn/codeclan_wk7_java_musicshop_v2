package com.docljn.scales.Spares.Strings;

import com.docljn.scales.Spares.Spares;
import com.docljn.scales.Spares.Pitch;

/**
 * Created by lornanoble on 20/01/2018.
 */

public class ViolaString extends Spares {

    private Pitch pitch;

    public ViolaString(String name, double purchasePrice, double sellingPrice, Pitch pitch) {
        super(name, purchasePrice, sellingPrice);
        this.pitch = pitch;
    }

    public Pitch getPitch() {
        return this.pitch;
    }
}
