package com.docljn.scales;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by docljn on 19/01/2018.
 */

public class ShopTest {


    Shop shop;
    private Sellable item;

    @Before
    public void before() {
        shop = new Shop("Scales");
    }

    @Test
    public void returnsName(){
        assertEquals("Scales", shop.getName());
    }

    @Test
    public void startsWithNoStock(){
        assertEquals(0, shop.getStockCount());
    }

    @Test
    public void canAddStock(){
        shop.buy(item);
    }

    @Test
    public void canSellStock(){
        shop.sell(item);
    }




}
