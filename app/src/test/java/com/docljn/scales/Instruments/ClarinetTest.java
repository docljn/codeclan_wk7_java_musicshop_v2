package com.docljn.scales.Instruments;

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
        clarinet = new Clarinet("E Flat Clarinet", 150, 250,  Section.WOODWIND,"Rosewood Inlay", ReedType.E_FLAT, ReedNumber.ONE);
    }

    @Test
    public void canGetReedType(){
        assertEquals(ReedType.E_FLAT, clarinet.getReedType());
    }

    @Test
    public void canGetReedNumber(){
        assertEquals(ReedNumber.ONE, clarinet.getReedNumber());
    }

    @Test
    public void reedNumberAffectsPlaying(){
        assertEquals("Duck-like quacking at 85.0dB" ,clarinet.play());
    }


}
