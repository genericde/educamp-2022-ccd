package ch.adesso.educamp;

import java.util.Arrays;

public class Printer {

    static void print(String[] fizzBuzzNumbers) {
        Arrays.asList(fizzBuzzNumbers).forEach(n -> {
            System.out.print(n + " ");
        });
    }

}
