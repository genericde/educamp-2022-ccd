package ch.adesso.educamp;

public class FizzBuzzConverter {

    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";

    static String[] convert(String[] numbersInRange) {
        for (int i = 1; i <= 100; i++) {
            if (isFizz(i) && isBuzz(i)) {
                numbersInRange[i-1] = FIZZ + BUZZ;
            } else if (isFizz(i)) {
                numbersInRange[i-1] = FIZZ;
            } else if (isBuzz(i)) {
                numbersInRange[i-1] = BUZZ;
            }
        }
        return numbersInRange;
    }

    private static boolean isFizz(int i) {
        return i % 3 == 0;
    }

    private static boolean isBuzz(int i) {
        return i % 5 == 0;
    }

}
