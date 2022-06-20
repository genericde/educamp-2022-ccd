package com.example.romans;

import fizzbuzz.NumberGenerator;
import fizzbuzz.Runner;
import linecount.FileReader2;
import linecount.Filefinder;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;
import java.io.IOException;
import java.util.List;

@SpringBootTest
class LineCounterTest {


	@Test
	void checkFileLines() throws IOException {
		Filefinder filefinder = new Filefinder();
		File file = filefinder.checkFilePath("input");
		FileReader2 fileReader = new FileReader2();
		Integer result = fileReader.readFile();
		assert(result  == 3);
	}
}
