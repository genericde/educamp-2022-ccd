package fizzbuzz;

import java.util.List;

public class FizzBuzzIntegration {

	public static void main(String[] args) {
		List<Integer> numbers = RangeGenerator.generate();
		List<String> lines = FizzBuzzConvertor.convert(numbers);
		Printer.print(lines);
	}
}
