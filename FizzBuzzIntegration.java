package FizzBuzz;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FizzBuzzIntegration {

	private static RangeGenerator rangeGenerator = new RangeGenerator();
	private static FizzBuzzConverter fizzBuzzConverter = new FizzBuzzConverter();
	private static Printer printer = new Printer();
	
	public static void main(String[] args) {
		IntStream numbers = rangeGenerator.generate();
		Stream<String> result = fizzBuzzConverter.convert(numbers);
		printer.print(result);
	}

	
}
