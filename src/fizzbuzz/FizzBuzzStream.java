package fizzbuzz;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FizzBuzzStream {

	private final FizzBuzz wordBuilder = new FizzBuzz();
	
	public Stream<String> generate(int upperBound) {
		return IntStream.rangeClosed(1, upperBound).mapToObj(wordBuilder::convert);
	}
}
