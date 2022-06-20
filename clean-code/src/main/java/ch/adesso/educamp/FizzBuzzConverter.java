package ch.adesso.educamp;

public class FizzBuzzConverter {

    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";

    static String[] convert(String[] numbersInRange) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                numbersInRange[i-1] = FIZZ + BUZZ;
            } else if (i % 3 == 0) {
                numbersInRange[i-1] = FIZZ;
            } else if (i % 5 == 0) {
                numbersInRange[i-1] = BUZZ;
            }
        }
        return numbersInRange;
    }

}
