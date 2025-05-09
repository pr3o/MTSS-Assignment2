////////////////////////////////////////////////////////////////////
// Filippo Compagno 2101082
// Leonardo Preo 2101092
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class IntegerToRoman {
    private static final int[] numbers = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    private static final String[] romans = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    public static String convert(int number) {
        if (number < 1 || number > 1000) {
            throw new IllegalArgumentException("Il numero deve essere compreso tra 0 e 1000");
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