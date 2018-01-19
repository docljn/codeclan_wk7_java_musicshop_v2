package com.docljn.scales;

/**
 * Created by lornanoble on 19/01/2018.
 */

interface Sellable {

    double getSellingPrice();
    double getPurchasePrice();

//    I want to add a default method here to calculate the markup, but that requires Java8
//    our AndroidStudio setup doesn't allow that.  BOTHER.

}
