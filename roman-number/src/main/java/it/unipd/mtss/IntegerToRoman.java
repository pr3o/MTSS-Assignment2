////////////////////////////////////////////////////////////////////
// Filippo Compagno 2101082
// Leonardo Preo 2101092
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class IntegerToRoman {
    private static final int[] numbers = {10, 9, 5, 4, 1};
    private static final String[] romans = {"X", "IX", "V", "IV", "I"};
    public static String convert(int number) {
        if (number < 1 || number > 20) {
            throw new IllegalArgumentException("Il numero deve essere compreso tra 0 e 20");
        }
        StringBuilder rn = new StringBuilder();
        for (int i = 0; i < numbers.length && number >= 0; i++) {
            while (numbers[i] <= number) {
                number -= numbers[i];
                rn.append(romans[i]);
            }
        }
        return rn.toString();
    }
}