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
        if (nextSymbol.equals("L")) {
            result += 40;
            return true;
        } else if (nextSymbol.equals("C")) {
            result += 90;
            return true;
        } else {
            result += 10;
        }
        return false;
    }

    private boolean convertI(String nextSymbol) {
        if (nextSymbol.equals("V")) {
            result += 4;
            return true;
        } else if (nextSymbol.equals("X")) {
            result += 9;
            return true;
        } else {
            result += 1;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("test");
    }
}
