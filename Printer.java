package FizzBuzz;

import java.util.stream.Stream;

public class Printer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void print(Stream<String> result) {
		result.forEach(line -> System.out.println(line));
	}

}
