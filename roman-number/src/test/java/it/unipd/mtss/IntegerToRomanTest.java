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
    public void testFirstOneHundredNumbers() {
        assertEquals("LI", IntegerToRoman.convert(51));
        assertEquals("LIII", IntegerToRoman.convert(53));
        assertEquals("LXIV", IntegerToRoman.convert(64));
        assertEquals("LXVIII", IntegerToRoman.convert(68));
        assertEquals("LXXV", IntegerToRoman.convert(75));
        assertEquals("LXXVII", IntegerToRoman.convert(77));
        assertEquals("LXXXII", IntegerToRoman.convert(82));
        assertEquals("LXXXIX", IntegerToRoman.convert(89));
        assertEquals("XCVI", IntegerToRoman.convert(96));
        assertEquals("C", IntegerToRoman.convert(100));
    }

    @Test
    public void testFirstFiveHundredNumbers() {
        assertEquals("CXXVII", IntegerToRoman.convert(127));
        assertEquals("CLXXI", IntegerToRoman.convert(171));
        assertEquals("CCII", IntegerToRoman.convert(202));
        assertEquals("CCXLVIII", IntegerToRoman.convert(248));
        assertEquals("CCXCIX", IntegerToRoman.convert(299));
        assertEquals("CCCXIII", IntegerToRoman.convert(313));
        assertEquals("CCCLIX", IntegerToRoman.convert(359));
        assertEquals("CDIV", IntegerToRoman.convert(404));
        assertEquals("CDLXXXVI", IntegerToRoman.convert(486));
        assertEquals("D", IntegerToRoman.convert(500));
    }

    @Test
    public void testFirstOneThousandNumbers() {
        assertEquals("DXXXVIII", IntegerToRoman.convert(538));
        assertEquals("DLXXI", IntegerToRoman.convert(571));
        assertEquals("DCXXIII", IntegerToRoman.convert(623));
        assertEquals("DCLXVI", IntegerToRoman.convert(666));
        assertEquals("DCCXV", IntegerToRoman.convert(715));
        assertEquals("DCCLXXVII", IntegerToRoman.convert(777));
        assertEquals("DCCCXLIV", IntegerToRoman.convert(844));
        assertEquals("DCCCLXXXII", IntegerToRoman.convert(882));
        assertEquals("CMXCIX", IntegerToRoman.convert(999));
        assertEquals("M", IntegerToRoman.convert(1000));
    }

    @Test
    public void testNumberOutOfBounds() {
        assertThrows(IllegalArgumentException.class, () -> IntegerToRoman.convert(0));
        assertThrows(IllegalArgumentException.class, () -> IntegerToRoman.convert(1001));
        assertThrows(IllegalArgumentException.class, () -> IntegerToRoman.convert(-1));
    }
}