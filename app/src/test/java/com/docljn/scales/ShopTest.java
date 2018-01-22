package com.docljn.scales;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by docljn on 19/01/2018.
 */

public class ShopTest {


    Shop shop;
    private PrintedMusic musicBook;


    @Before
    public void before() {
        shop = new Shop("Scales");
        musicBook = new PrintedMusic("Book", 5.00, 12.99);
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
        shop.buy(musicBook);
        assertEquals(1, shop.getStockCount());
    }

    /*
    PAUSED at this point, as I need to develop the sellable item interface more in order to sell something
    START with PRINTED MUSIC class as this has very few other features
     */
    @Test
    public void saleReducesShopStock(){
        shop.buy(musicBook);
        shop.sell(musicBook);
        assertEquals(0, shop.getStockCount());
    }

    @Test
    public void saleIncreasesShopCashByPrice(){
        shop.buy(musicBook);
        shop.sell(musicBook);
        assertEquals(12.99, shop.getCashCount(), 0.001);
    }

    @Test
    public void saleRequiresItemInStock(){
        shop.sell(musicBook);
        assertEquals(0.00, shop.getCashCount(), 0.001);
    }

    @Test
    public void canDetermineItemMarkup(){
        assertEquals(7.99, shop.getMarkup(musicBook), 0.001);
    }

    @Test
    public void canCalculateTotalPotentialProfit(){
        shop.buy(musicBook);
        shop.buy(musicBook);
        assertEquals(15.98, shop.getMaxProfit(), 0.001);

    }





}
