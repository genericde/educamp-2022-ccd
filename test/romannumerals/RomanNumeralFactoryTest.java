package romannumerals;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class RomanNumeralFactoryTest {

	RomanNumeralFactory instance = new RomanNumeralFactory();
	
	@Test
	void convertOne() {
		var result = instance.fromDecimalValue(1);
		
		assertEquals("I", result.toString());
	}
	
	@Test
	void convertThree() {
		var result = instance.fromDecimalValue(3);
		
		assertEquals("III", result.toString());
	}
	
	@Test
	void convertFour() {
		var result = instance.fromDecimalValue(4);
		
		assertEquals("IV", result.toString());
	}
	
	@Test
	void convertFive() {
		var result = instance.fromDecimalValue(5);
		
		assertEquals("V", result.toString());
	}
	
	@Test
	void convertSix() {
		var result = instance.fromDecimalValue(6);
		
		assertEquals("VI", result.toString());
	}
	
	@Test
	void convertNine() {
		var result = instance.fromDecimalValue(9);
		
		assertEquals("IX", result.toString());
	}
	
	@Test
	void convertTen() {
		var result = instance.fromDecimalValue(10);
		
		assertEquals("X", result.toString());
	}
	
	@Test
	void convertFortyTwo() {
		var result = instance.fromDecimalValue(42);
		
		assertEquals("XLII", result.toString());
	}
	
	@Test
	void convertFortyFour() {
		var result = instance.fromDecimalValue(44);
		
		assertEquals("XLIV", result.toString());
	}
}
