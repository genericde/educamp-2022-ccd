import java.util.HashMap;
import java.util.Map;

class RomanNumerals {

    public static void main(String[] args) {

        System.out.println("test");

        String romanNumeral="MCMXCIV";
        int result = convertRomanToInteger(romanNumeral);

        System.out.println("The Roman Number is: " + romanNumeral);
        System.out.println("Its Integer Value is: " + result);
    }

    public static int convertRomanToInteger(String romanNumeral) {
        Map<Character,Integer> numbersMap = new HashMap<>();
        numbersMap.put('I', 1);
        numbersMap.put('V', 5);
        numbersMap.put('X', 10);
        numbersMap.put('L', 50);
        numbersMap.put('C', 100);
        numbersMap.put('D', 500);
        numbersMap.put('M', 1000);

        int result=0;

        for (int i=0; i < romanNumeral.length(); i++) {
            char ch = romanNumeral.charAt(i);

            if (i > 0 && numbersMap.get(ch) > numbersMap.get(romanNumeral.charAt(i-1))) {
                result += numbersMap.get(ch) - 2*numbersMap.get(romanNumeral.charAt(i-1));
            }

            else
                result += numbersMap.get(ch);
        }

        return result;
    }

}
