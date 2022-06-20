package fizzbuzz;

import java.util.List;

public class NumberEcho {

	public static String buildEcho(Integer number) {
		String echo = new String();
		echo += fizzEcho(number);
		echo += buzzEcho(number);
		return echo.length() > 0 ? echo : number.toString();
	}
	
	public static void doEcho(List<Integer> numbers) {
		for (Integer n : numbers) {
			System.out.println(buildEcho(n));
		}
	}
	
	private static String fizzEcho(int number) {
		return (number % 3 == 0) ? "fizz" : "";
	}
	
	private static String buzzEcho(int number) {
		return (number % 5 == 0) ? "buzz" : "";
	}
	
}
