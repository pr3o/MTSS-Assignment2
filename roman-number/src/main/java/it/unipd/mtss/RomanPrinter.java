////////////////////////////////////////////////////////////////////
// Filippo Compagno 2101082
// Leonardo Preo 2101092
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class RomanPrinter {
    private final static int height = 6;

    private final static String[] I = {" _____ ",
                                      "|_   _|",
                                      "  | |  ", 
                                      "  | |  ",
                                      " _| |_ ",
                                      "|_____|" };

    private final static String[] V = {"__      __",
                                      "\\ \\    / /",
                                      " \\ \\  / / ",
                                      "  \\ \\/ /  ",
                                      "   \\  /   ",
                                      "    \\/    "};

    private final static String[] X = {"__   __",
                                      "\\ \\ / /",
                                      " \\ V / ",
                                      "  > <  ",
                                      " / . \\ ",
                                      "/_/ \\_\\"};

    private final static String[] L = {" _      ",
                                      "| |     ",
                                      "| |     ",
                                      "| |     ",
                                      "| |____ ",
                                      "|______|"};
                         
    private final static String[] C =  {"  _____ ",
                                       " / ____|",
                                       "| |     ",
                                       "| |     ",
                                       "| |____ ",
                                       " \\_____|"};

    private final static String[] D = {" _____  ",
                                      "|  __ \\ ",
                                      "| |  | |",
                                      "| |  | |",
                                      "| |__| |",
                                      "|_____/ "};

    private final static String[] M = {" __  __ ",
                                      "|  \\/  |",
                                      "| \\  / |",
                                      "| |\\/| |",
                                      "| |  | |",
                                      "|_|  |_|"};

    public static String print(int num) {
        return printAsciiArt(IntegerToRoman.convert(num));
    }

    private static String printAsciiArt(String romanNumber) {
        StringBuilder asciiArt = new StringBuilder();
        for (int i = 0; i < height; i++) {
        for (String letter : romanNumber.split("")) {
          switch(letter) {
                case "I":
                    asciiArt.append(I[i]);
                    break;
                case "V":
                    asciiArt.append(V[i]);
                    break;
                case "X":
                    asciiArt.append(X[i]);
                    break;
                case "L":
                    asciiArt.append(L[i]);
                    break;
                case "C":
                    asciiArt.append(C[i]);
                    break;
                case "D":
                    asciiArt.append(D[i]);
                    break;
                case "M":
                    asciiArt.append(M[i]);
                    break;
                default:
                    return "";
          }
          asciiArt.append(" ");
        }
        asciiArt.append("\n");
        }
        asciiArt.deleteCharAt(asciiArt.length() - 1);
        return asciiArt.toString();
    }
}