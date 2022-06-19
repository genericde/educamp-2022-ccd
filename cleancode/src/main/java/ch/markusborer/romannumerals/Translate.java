package ch.markusborer.romannumerals;

public class Translate {

    public int translate(String roman) {
        int result = 0;
        for (int i = 0; i < roman.length(); i++) {
            String symbol = roman.substring(i, i + 1);
            result +=  switch (symbol) {
                case "M" -> 1000;
                case "D" -> 500;
                case "C" -> convertC(nextSmbol(roman, i));
                case "L" -> 50;
                case "X" -> convertX(nextSmbol(roman, i));
                case "V" -> 5;
                case "I" -> convertI(nextSmbol(roman, i));
                default -> 0;
            };
        }
        return result;
    }

    private String nextSmbol(String roman, int i) {
        String nextSymbol = "";
        if (roman.length() > i + 1) {
            nextSymbol = roman.substring(i + 1, i + 2);
        }
        return nextSymbol;
    }

    private int convertC(String nextSymbol) {
        return switch (nextSymbol) {
            case "D" -> -100;
            case "M" -> -100;
            default -> 100;
        };
    }

    private int convertX(String nextSymbol) {
        return switch (nextSymbol) {
            case "L" -> -10;
            case "C" -> -10;
            default -> 10;
        };
    }

    private int convertI(String nextSymbol) {
        return switch (nextSymbol) {
            case "V" -> -1;
            case "X" -> -1;
            default -> 1;
        };
    }

    public static void main(String[] args) {
        System.out.println("test");
    }
}
