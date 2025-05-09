////////////////////////////////////////////////////////////////////
// Filippo Compagno 2101082
// Leonardo Preo 2101092
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class IntegerToRoman {
    public static String convert(int number) {
        if (number < 1 || number > 6) {
            throw new IllegalArgumentException("La conversione può essere effettuate solamente con numeri compresi tra 0 e 6");
        }
        StringBuilder rn = new StringBuilder();
        if (number >= 5) {
            rn.append("V");
            number -= 5;
            for (int i = 0; i < number; i++) {
                rn.append("I");
            }
        } else {
            if (number == 4) {
                rn.append("IV");
            } else {
                for (int i = 0; i < number; i++) {
                    rn.append("I");
                }
            }
        }
        return rn.toString();
    }
}