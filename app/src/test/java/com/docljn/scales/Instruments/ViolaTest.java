package com.docljn.scales.Instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by lornanoble on 20/01/2018.
 */

public class ViolaTest {

    private Viola viola;

    @Before
    public void before(){
        viola = new Viola("Viola", 200, 450, Section.STRINGS, "Rosewood", "C, G, D, A");
    }


    @Test
    public void canPlay(){
        assertEquals("Mellow bowed strings", viola.play());
    }

    @Test
    public void hasStringTuning(){
        assertEquals("C, G, D, A", viola.getStringTuning());
    }

}
