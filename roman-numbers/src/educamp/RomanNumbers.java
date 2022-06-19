package educamp;

import java.util.HashMap;
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

        Map<Character, Integer> heavyMap = new HashMap<>();
        heavyMap.put(I, 1);
        heavyMap.put(V, 5);
        heavyMap.put(X, 10);
        heavyMap.put(L, 50);
        heavyMap.put(C, 100);
        heavyMap.put(D, 500);
        heavyMap.put(M, 1000);

        char[] romanChars = romanNumber.toCharArray();

        int result = 0;
        for (int i = 0; i < romanChars.length; i++) {
            char nextChar = romanChars[i];

            if (charPrecedingBiggerChar(nextChar, i, romanChars, heavyMap)) {
                result -= heavyMap.get(nextChar);
            } else {
                result += heavyMap.get(nextChar);
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
