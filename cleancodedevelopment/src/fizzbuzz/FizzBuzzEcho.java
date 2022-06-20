package fizzbuzz;

import java.util.List;

public class FizzBuzzEcho {

	public static void main(String[] args) {

		int start = parseInt(args[0]);
		int end = parseInt(args[1]);
		
		List<Integer> numbers = NumberSequenceGenerator.generate(start, end);
		NumberEcho.doEcho(numbers);
	}

	private static int parseInt(String s) {
		return Integer.valueOf(s);
	}

}
