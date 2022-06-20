package ch.adesso.educamp;

public class FizzBuzzConverter {

    static String[] convert(String[] numbersInRange) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                numbersInRange[i-1] = "FizzBuzz";
            } else if (i % 3 == 0) {
                numbersInRange[i-1] = "Fizz";
            } else if (i % 5 == 0) {
                numbersInRange[i-1] = "Buzz";
            }
        }
        return numbersInRange;
    }

}
