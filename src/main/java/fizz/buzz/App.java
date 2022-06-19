package main.java.fizz.buzz;

public class App {

    public static void main(String[] args) {
        for (int i = 1; i < 101; i++) {
            printFizzBuzzNumber(i);
        }
    }

    private static void printFizzBuzzNumber(int i) {
        System.out.println(FizzBuzz.replaceIfFizzBuzzNumber(i));
    }
}
