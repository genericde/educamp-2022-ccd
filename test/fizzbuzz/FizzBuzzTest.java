package fizzbuzz;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class FizzBuzzTest {

	FizzBuzz wordBuilder = new FizzBuzz();
	
	@Test
	void fifteenIsFizzBuzz() {
		var result = wordBuilder.buildWord(15);
		
		assertEquals("FIZZBUZZ", result);
	}
	
	@Test
	void twoIsPlainNumber() {
		var result = wordBuilder.buildWord(2);
		
		assertEquals("2", result);
	}
	
	@Test
	void negativeValueIsNotAllowed() {
		assertThrows(IllegalArgumentException.class, () -> wordBuilder.buildWord(-2));
	}
}
