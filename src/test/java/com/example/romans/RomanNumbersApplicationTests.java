package com.example.romans;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class RomanNumbersApplicationTests {

	@Test
	void contextLoads() {
	}


	@Test
	void Add2RomansNumbers() {
		List<String> list = new ArrayList<>();
		list.add("I");
		list.add("I");
		list.add("I");
		list.add("M");
		list.add("M");
		list.add("V");
		list.add("V");
		list.add("I");

		NumberCalculator calculator= new NumberCalculator();
		System.out.println("RESULT: " + calculator.calculateArray(list));
	}
}
