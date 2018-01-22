package com.docljn.scales.Spares.Reeds;

<<<<<<< HEAD
import com.docljn.scales.Spares.Spares;
=======
import com.docljn.scales.StockItem;
>>>>>>> fromV1

/**
 * Created by lornanoble on 20/01/2018.
 */

<<<<<<< HEAD
public class ClarinetReed extends Spares {
=======
public class ClarinetReed extends StockItem {
>>>>>>> fromV1
    private ClarinetReedType clarinetReedType;
    private ClarinetReedNumber clarinetReedNumber;

    public ClarinetReed(String name, double purchasePrice, double sellingPrice, ClarinetReedType clarinetReedType, ClarinetReedNumber clarinetReedNumber) {
        super(name, purchasePrice, sellingPrice);
        this.clarinetReedType = clarinetReedType;
        this.clarinetReedNumber = clarinetReedNumber;
    }

    public ClarinetReedType getClarinetReedType() {
        return this.clarinetReedType;
    }


    public ClarinetReedNumber getClarinetReedNumber() {
        return this.clarinetReedNumber;
    }
}
