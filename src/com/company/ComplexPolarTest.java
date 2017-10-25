package com.company;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ComplexPolarTest {
    double mod = 1;
    double pha = Math.PI/4;
    Complex c  = new ComplexPolar(mod, pha);

    Complex same_c = new ComplexPolar(1, Math.PI/4);
    Complex not_same_c =  new ComplexPolar(2, Math.PI/4);

    @Test
    void re() {
        assertEquals(Math.sqrt(2)/2, c.re(), 0.000001);
    }

    @Test
    void im() {
        assertEquals(Math.sqrt(2)/2, c.im(), 0.000001);
    }

    @Test
    void theta() {
        assertEquals(pha, c.theta(), 0.000001);
    }

    @Test
    void abs() {
        assertEquals(mod, c.abs(), 0.000001);
    }

    @Test
    void same() {
        assertTrue(c.same(same_c));
        assertFalse(c.same(not_same_c));
    }
}