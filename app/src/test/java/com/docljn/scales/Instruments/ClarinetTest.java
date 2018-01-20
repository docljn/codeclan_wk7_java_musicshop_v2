package com.docljn.scales.Instruments;

import com.docljn.scales.Spares.Reeds.ClarinetReed;
import com.docljn.scales.Spares.Reeds.ReedNumber;
import com.docljn.scales.Spares.Reeds.ReedType;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by lornanoble on 20/01/2018.
 */

public class ClarinetTest {

    Clarinet clarinet;


    @Before
    public void before() {
        clarinet = new Clarinet("E Flat Clarinet", 150, 250,  Section.WOODWIND,"Rosewood Inlay");
    }

    @Test
    public void canGetReedType(){
        assertEquals(ReedType.E_FLAT, clarinet.getReedType());
    }

    @Test
    public void canGetReedNumber(){
        assertEquals(ReedNumber.TWO, clarinet.getReedNumber());
    }

    @Test
    public void reedNumberAffectsPlaying(){
        assertEquals("Duck-like quacking at 90.0dB" ,clarinet.play());
    }

    @Test
    public void canChangeReed(){
        ClarinetReed reed2 = new ClarinetReed("Boosey", 3.00, 5.00, ReedType.E_FLAT, ReedNumber.FIVE);
        clarinet.setReed(reed2);
        assertEquals(ReedNumber.FIVE, clarinet.getReedNumber());
    }


}
