package fizzbuzz;

import org.junit.jupiter.api.Test;

class FizzBuzzStreamTest {

	@Test
	void generate100Words() {
		new FizzBuzzStream().generate(100).forEach(System.out::println);
	}
}
