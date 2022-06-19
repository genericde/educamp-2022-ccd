package ch.adesso;

public class FizzBuzz {

    private static final int REST_VALUE = 0;
    public static final int THREE = 3;
    public static final int FIVE = 5;
    public static final String FIZZ_MESSAGE = "Fizz";
    public static final String BUZZ_MESSAGE = "Buzz";
    public static final String FIZZBUZZ_MESSAGE = "FizzBuzz";

    public static void main(String[] args) {
        displayNumbers();
    }

    public static void displayNumbers() {
        for( int i = 1; i <= 100; i++)
            System.out.println(printFizzBuzzMessage(i));
    }

    public static boolean isDivisibleByThree(int number) {
        return  number % THREE == REST_VALUE;
    }

    public static boolean isDivisibleByFive(int number) {
        return number % FIVE == REST_VALUE;
    }

    public static boolean isDivisibleByThreeAndFive(int number) {
        return isDivisibleByThree(number) && isDivisibleByFive(number);
    }

    public static String printFizzBuzzMessage(Integer number){
        if(isDivisibleByThreeAndFive(number))
            return FIZZBUZZ_MESSAGE;
        else if(isDivisibleByFive(number))
            return BUZZ_MESSAGE;
        else if (isDivisibleByThree(number))
            return FIZZ_MESSAGE;
        else
            return number.toString();
    }
}
