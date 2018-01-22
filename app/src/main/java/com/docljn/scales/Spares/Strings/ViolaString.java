package com.docljn.scales.Spares.Strings;

<<<<<<< HEAD
import com.docljn.scales.Spares.Spares;
import com.docljn.scales.Spares.Pitch;
=======
import com.docljn.scales.Spares.Pitch;
import com.docljn.scales.StockItem;
>>>>>>> fromV1

/**
 * Created by lornanoble on 20/01/2018.
 */

<<<<<<< HEAD
public class ViolaString extends Spares {
=======
public class ViolaString extends StockItem {
>>>>>>> fromV1

    private Pitch pitch;

    public ViolaString(String name, double purchasePrice, double sellingPrice, Pitch pitch) {
        super(name, purchasePrice, sellingPrice);
        this.pitch = pitch;
    }

    public Pitch getPitch() {
        return this.pitch;
    }
}
