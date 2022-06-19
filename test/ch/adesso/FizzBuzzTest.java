package ch.adesso;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class FizzBuzzTest {

    @Test
    public void isDivisibleByThreeAndFiveTest(){
        int testingNumber = 15;
        assertTrue(FizzBuzz.isDivisibleByFive(testingNumber));
    }

    @Test
    public void isDivisibleByThreeTest(){
        int testingNumber = 6;
        assertTrue(FizzBuzz.isDivisibleByThree(testingNumber));
    }


    @Test
    public void isDivisibleByFiveTest(){
        int testingNumber = 10;
        assertTrue(FizzBuzz.isDivisibleByFive(testingNumber));
    }

    @Test
    public void printFizzBuzzMessage(){

    }
}
