package FizzBuzz;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FizzBuzzConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public Stream<String> convert(IntStream numbers) {
		return numbers.mapToObj(number -> replaceNumber(number));
		
	}

	private static String replaceNumber(Integer number) {
		return buildFizz(number).concat(buildBuzz(number)).concat(buildNumber(number));
	}
	
	private static String buildFizz(int number) {		
		if (isDivisibleByThree(number)) { 
			return "Fizz";
		}
		return "";		
	}
	
	private static String buildBuzz(int number) {
		if (isDivisibleByFive(number)) { 
			return "Buzz";
		}
		return "";		
	}

	private static String buildNumber(int number) {
		if (!isDivisibleByThree(number) && !isDivisibleByFive(number)) {
			return String.valueOf(number);
		}
		return "";		
	}

	private static boolean isDivisibleByThree(int number) {
		return number%3 == 0;
	}
	
	private static boolean isDivisibleByFive(int number) {
		return number%5 == 0;
	}

}
