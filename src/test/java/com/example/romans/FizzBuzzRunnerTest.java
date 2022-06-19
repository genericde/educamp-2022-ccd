package com.example.romans;

import fizzbuzz.NumberGenerator;
import fizzbuzz.NumberValidator;
import fizzbuzz.Runner;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.xml.validation.Validator;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class FizzBuzzRunnerTest {


	@Test
	void DispayNumbersToConsole() {
		Runner runner = new Runner();
		NumberGenerator generator = new NumberGenerator();

		List<Integer> result = generator.generateNumbersOne2Hundred();
		runner.generateResultList();
	}
}
