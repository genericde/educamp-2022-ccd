package ch.markusborer.fizzbuzz;

public class FizzBuzz {

    public void showNumbersFrom1To100() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(convert(i));
        }
    }

    public String convert(int i) {
        boolean isDividibleBy3 = i % 3 == 0;
        boolean isDividibleBy5 = i % 5 == 0;
        if (isDividibleBy3 && isDividibleBy5) {
            return "FizzBuzz";
        } else if (isDividibleBy3) {
            return "Fizz";
        } else if (isDividibleBy5) {
            return "Buzz";
        } else {
            return String.valueOf(i);
        }
    }

    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.showNumbersFrom1To100();
    }
}
