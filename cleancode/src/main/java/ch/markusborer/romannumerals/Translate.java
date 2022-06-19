package ch.markusborer.romannumerals;

public class Translate {

    private int result;

    public int translate(String roman) {
        for (int i = 0; i < roman.length(); i++) {
            String symbol = roman.substring(i, i + 1);
            String nextSymbol = "";
            if (roman.length() > i + 1) {
                nextSymbol = roman.substring(i + 1, i + 2);
            }
            if (symbol.equals("M")) {
                result += 1000;
            } else if (symbol.equals("D")) {
                result += 500;
            } else if (symbol.equals("C")) {
                result += 100;
            } else if (symbol.equals("L")) {
                result += 50;
            } else if (symbol.equals("X")) {
                if (convertX(nextSymbol)) {
                    i++;
                };
            } else if (symbol.equals("V")) {
                result += 5;
            } else if (symbol.equals("I")) {
                if (convertI(nextSymbol)) {
                    i++;
                };
            }
        }
        return result;
    }

    private boolean convertX(String nextSymbol) {
        return switch (nextSymbol) {
            case "L" -> {
                result += 40;
                yield true;
            }
            case "C" -> {
                result += 90;
                yield true;
            }
            default -> {
                result += 10;
                yield false;
            }
        };
    }

    private boolean convertI(String nextSymbol) {
        return switch (nextSymbol) {
            case "V" -> {
                result += 4;
                yield true;
            }
            case "X" -> {
                result += 9;
                yield true;
            }
            default -> {
                result += 1;
                yield false;
            }
        };
    }

    public static void main(String[] args) {
        System.out.println("test");
    }
}
