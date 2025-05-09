////////////////////////////////////////////////////////////////////
// Filippo Compagno 2101082
// Leonardo Preo 2101092
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class IntegerToRoman {
    public static String convert(int number) {
        if (number < 1 || number > 3) {
            throw new IllegalArgumentException("La conversione può essere effettuate solamente con numeri compresi tra 0 e 3");
        }
        StringBuilder rn = new StringBuilder();
        for (int i = 0; i < number; i++) {
            rn.append("I");
        }
        return rn.toString();
    }
}