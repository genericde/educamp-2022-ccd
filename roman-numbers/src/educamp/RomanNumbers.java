package educamp;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RomanNumbers {

    public static final char I = 'I';
    public static final char V = 'V';
    public static final char X = 'X';
    public static final char L = 'L';
    public static final char C = 'C';
    public static final char D = 'D';
    public static final char M = 'M';

    public static void main(String[] args) {

        calculateDecimalNumber(args[0]);

    }

    private static void calculateDecimalNumber(String romanNumber) {

        List<Character> orderedRomanChars = Arrays.asList(I, V, X, L, C, D, M);

        Map<Character, Integer> heavyMap = new HashMap<>();
        heavyMap.put(I, 1);
        heavyMap.put(V, 2);
        heavyMap.put(X, 3);
        heavyMap.put(L, 4);
        heavyMap.put(C, 5);
        heavyMap.put(D, 6);
        heavyMap.put(M, 7);

        char[] romanChars = romanNumber.toCharArray();

        int result = 0;
        for (int i = 0; i < romanChars.length; i++) {
            char nextChar = romanChars[i];

            if (charPrecedingBiggerChar(nextChar, i, romanChars, heavyMap)) {
                if (nextChar == I) {
                    result -= 1;
                } else if (nextChar == V) {
                    result -= 5;
                } else if (nextChar == X) {
                    result -= 10;
                } else if (nextChar == L) {
                    result -= 50;
                } else if (nextChar == C) {
                    result -= 100;
                } else if (nextChar == D) {
                    result -= 500;
                } else if (nextChar == M) {
                    result -= 1000;
                }
            } else {
                if (nextChar == I) {
                    result += 1;
                } else if (nextChar == V) {
                    result += 5;
                } else if (nextChar == X) {
                    result += 10;
                } else if (nextChar == L) {
                    result += 50;
                } else if (nextChar == C) {
                    result += 100;
                } else if (nextChar == D) {
                    result += 500;
                } else if (nextChar == M) {
                    result += 1000;
                }

            }

        }

        System.out.println("Result = " + result);

    }

    private static boolean charPrecedingBiggerChar(char nextChar, int position, char[] romanInput, Map<Character, Integer> heavyMap) {

        for (int i = position + 1; i < romanInput.length; i++) {
            char followingChar = romanInput[i];

            // check if there are heavier chars following in the string
            if (heavyMap.get(followingChar) > heavyMap.get(nextChar)) {
                return true;
            }

        }

        return false;
    }

}
