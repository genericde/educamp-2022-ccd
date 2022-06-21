package argparser;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ValueExtractorTest {

	@Test
	void getValueForF() {
		String value = ValueExtractor.get("f", new ParsedArgs());
		assertEquals("dummyOutput", value);
	}

}
