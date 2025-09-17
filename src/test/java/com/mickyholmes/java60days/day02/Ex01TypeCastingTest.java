package com.mickyholmes.java60days.day02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class Ex01TypeCastingTest {

    @Test
    void compute_returnsExpectedCasts_for42_75() {
        double shapeValue = 42.75;
        var r = Ex01TypeCasting.compute(shapeValue);

        assertEquals(42, r.asInt());
        assertEquals(42L, r.asLong());
        assertEquals(42.75f, r.asFloat());
        assertEquals(42, r.asByte());
        assertEquals(42, r.asShort());
    }

    @Test
    void byte_wrapsWhenOutOfRange() {
        double shapeValue = 130.56;
        var r = Ex01TypeCasting.compute(shapeValue);
        assertEquals(-126, r.asByte());
    }

}
