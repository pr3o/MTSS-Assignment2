////////////////////////////////////////////////////////////////////
// Filippo Compagno 2101082
// Leonardo Preo 2101092
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RomanPrinterTest {
    @Test
    public void testPrint1AsI() {
        String expected = String.join("\n",
            " _____  ",
            "|_   _| ",
            "  | |   ",
            "  | |   ",
            " _| |_  ",
            "|_____| ");
        assertEquals(expected, RomanPrinter.print(1));
    }

    @Test
    public void testPrint4AsIV() {
        String expected = String.join("\n",
            " _____  __      __ ",
            "|_   _| \\ \\    / / ",
            "  | |    \\ \\  / /  ",
            "  | |     \\ \\/ /   ",
            " _| |_     \\  /    ",
            "|_____|     \\/     ");
        assertEquals(expected, RomanPrinter.print(4));
    }

    @Test
    public void testPrint9AsIX() {
        String expected = String.join("\n",
            " _____  __   __ ",
            "|_   _| \\ \\ / / ",
            "  | |    \\ V /  ",
            "  | |     > <   ",
            " _| |_   / . \\  ",
            "|_____| /_/ \\_\\ ");
        assertEquals(expected, RomanPrinter.print(9));
    }

    @Test
    public void testPrint44AsXLIV() {
        String expected = String.join("\n",
            "__   __  _        _____  __      __ ",
            "\\ \\ / / | |      |_   _| \\ \\    / / ",
            " \\ V /  | |        | |    \\ \\  / /  ",
            "  > <   | |        | |     \\ \\/ /   ",
            " / . \\  | |____   _| |_     \\  /    ",
            "/_/ \\_\\ |______| |_____|     \\/     ");
        assertEquals(expected, RomanPrinter.print(44));
    }

    @Test
    public void testPrint99AsXCIX() {
        String expected = String.join("\n",
            "__   __   _____   _____  __   __ ",
            "\\ \\ / /  / ____| |_   _| \\ \\ / / ",
            " \\ V /  | |        | |    \\ V /  ",
            "  > <   | |        | |     > <   ",
            " / . \\  | |____   _| |_   / . \\  ",
            "/_/ \\_\\  \\_____| |_____| /_/ \\_\\ ");
        assertEquals(expected, RomanPrinter.print(99));
    }

    @Test
    public void testPrint444AsCDXLIV() {
        String expected = String.join("\n",
            "  _____   _____   __   __  _        _____  __      __ ",
            " / ____| |  __ \\  \\ \\ / / | |      |_   _| \\ \\    / / ",
            "| |      | |  | |  \\ V /  | |        | |    \\ \\  / /  ",
            "| |      | |  | |   > <   | |        | |     \\ \\/ /   ",
            "| |____  | |__| |  / . \\  | |____   _| |_     \\  /    ",
            " \\_____| |_____/  /_/ \\_\\ |______| |_____|     \\/     ");
        assertEquals(expected, RomanPrinter.print(444));
    }

    @Test
    public void testPrint999AsCMXCIX() {
        String expected = String.join("\n",
            "  _____   __  __  __   __   _____   _____  __   __ ",
            " / ____| |  \\/  | \\ \\ / /  / ____| |_   _| \\ \\ / / ",
            "| |      | \\  / |  \\ V /  | |        | |    \\ V /  ",
            "| |      | |\\/| |   > <   | |        | |     > <   ",
            "| |____  | |  | |  / . \\  | |____   _| |_   / . \\  ",
            " \\_____| |_|  |_| /_/ \\_\\  \\_____| |_____| /_/ \\_\\ ");
        assertEquals(expected, RomanPrinter.print(999));
    }

    @Test
    public void testPrint1000AsM() {
        String expected = String.join("\n",
            " __  __  ",
            "|  \\/  | ",
            "| \\  / | ",
            "| |\\/| | ",
            "| |  | | ",
            "|_|  |_| ");
        assertEquals(expected, RomanPrinter.print(1000));
    }
    
    @Test
    public void testPrintOutOfBounds() {
        assertThrows(IllegalArgumentException.class, () -> RomanPrinter.print(0));
        assertThrows(IllegalArgumentException.class, () -> RomanPrinter.print(1001));
        assertThrows(IllegalArgumentException.class, () -> RomanPrinter.print(-1));
    }
}