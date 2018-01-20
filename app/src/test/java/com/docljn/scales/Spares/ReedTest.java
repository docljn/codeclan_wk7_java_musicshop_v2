package com.docljn.scales.Spares;

import com.docljn.scales.Spares.Reeds.ClarinetReed;
import com.docljn.scales.Spares.Reeds.ReedNumber;
import com.docljn.scales.Spares.Reeds.ReedType;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by lornanoble on 20/01/2018.
 */

public class ReedTest {

    private ClarinetReed reedBb;

    @Before
    public void before(){
        reedBb = new ClarinetReed("Yamaha", 1.50, 3.50, ReedType.B_FLAT, ReedNumber.FIVE);
    }

    @Test
    public void returnsType(){
        assertEquals(ReedType.B_FLAT, reedBb.getReedType());
    }

    @Test
    public void returnsNumber(){
        assertEquals(ReedNumber.FIVE, reedBb.getReedNumber());
    }
}
