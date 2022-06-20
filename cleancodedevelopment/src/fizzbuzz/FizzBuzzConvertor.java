package fizzbuzz;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzzConvertor {

	public static String convert(Integer number) {
		String echo = new String();
		echo += fizzEcho(number);
		echo += buzzEcho(number);
		return echo.length() > 0 ? echo : number.toString();
	}
	
	public static List<String> convert(List<Integer> numbers) {
		ArrayList<String> lines = new ArrayList<>();
		for (Integer n : numbers) {
			lines.add(convert(n));
		}
		return lines;
	}
	
	private static String fizzEcho(int number) {
		return (number % 3 == 0) ? "fizz" : "";
	}
	
	private static String buzzEcho(int number) {
		return (number % 5 == 0) ? "buzz" : "";
	}
	
}
