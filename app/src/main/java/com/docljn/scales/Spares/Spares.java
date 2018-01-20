package com.docljn.scales.Spares;

import com.docljn.scales.StockItem;

/**
 * Created by lornanoble on 20/01/2018.
 */

public abstract class Spares extends StockItem {
    public Spares(String name, double purchasePrice, double sellingPrice) {
        super(name, purchasePrice, sellingPrice);

    }
}
