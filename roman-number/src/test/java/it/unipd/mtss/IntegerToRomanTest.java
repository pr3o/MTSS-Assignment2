////////////////////////////////////////////////////////////////////
// Filippo Compagno 2101082
// Leonardo Preo 2101092
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class IntegerToRomanTest {
    @Test
    public void testFirstThreeNumbers() {
        assertEquals("I", IntegerToRoman.convert(1));
        assertEquals("II", IntegerToRoman.convert(2));
        assertEquals("III", IntegerToRoman.convert(3));
    }

    @Test
    public void testFirstSixNumbers() {
        assertEquals("IV", IntegerToRoman.convert(4));
        assertEquals("V", IntegerToRoman.convert(5));
        assertEquals("VI", IntegerToRoman.convert(6));
    }

    @Test
    public void testFirstTenNumbers() {
        assertEquals("VII", IntegerToRoman.convert(7));
        assertEquals("VIII", IntegerToRoman.convert(8));
        assertEquals("IX", IntegerToRoman.convert(9));
        assertEquals("X", IntegerToRoman.convert(10));
    }

    @Test
    public void testFirstTwentyNumbers() {
        assertEquals("XI", IntegerToRoman.convert(11));
        assertEquals("XII", IntegerToRoman.convert(12));
        assertEquals("XIII", IntegerToRoman.convert(13));
        assertEquals("XIV", IntegerToRoman.convert(14));
        assertEquals("XV", IntegerToRoman.convert(15));
        assertEquals("XVI", IntegerToRoman.convert(16));
        assertEquals("XVII", IntegerToRoman.convert(17));
        assertEquals("XVIII", IntegerToRoman.convert(18));
        assertEquals("XIX", IntegerToRoman.convert(19));
        assertEquals("XX", IntegerToRoman.convert(20));
    }

    @Test
    public void testFirstFiftyNumbers() {
        assertEquals("XXII", IntegerToRoman.convert(22));
        assertEquals("XXV", IntegerToRoman.convert(25));
        assertEquals("XXX", IntegerToRoman.convert(30));
        assertEquals("XXXVII", IntegerToRoman.convert(37));
        assertEquals("XL", IntegerToRoman.convert(40));
        assertEquals("XLIII", IntegerToRoman.convert(43));
        assertEquals("XLV", IntegerToRoman.convert(45));
        assertEquals("XLIX", IntegerToRoman.convert(49));
        assertEquals("L", IntegerToRoman.convert(50));
    }

    @Test
    public void testNumberOutOfBounds() {
        assertThrows(IllegalArgumentException.class, () -> IntegerToRoman.convert(0));
        assertThrows(IllegalArgumentException.class, () -> IntegerToRoman.convert(51));
        assertThrows(IllegalArgumentException.class, () -> IntegerToRoman.convert(-1));
    }
}