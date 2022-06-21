package argsparser;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ArgsParserTest {

	@Test
	void parseValidArgumentShouldReturnBoolean() {
		var result = ArgsParser.parse("f?,j#,w*", "-f -j123 -wSomeText", 'f');
		
		assertEquals(Boolean.TRUE, result);
	}
	
	@Test
	void parseValidArgumentShouldReturnInteger() {
		var result = ArgsParser.parse("f?,j#,w*", "-f -j123 -wSomeText", 'j');
		
		assertEquals(123, result);
	}
	
	@Test
	void parseValidArgumentShouldReturnString() {
		var result = ArgsParser.parse("f?,j#,w*", "-f -j123 -wSomeText", 'w');
		
		assertEquals("SomeText", result);
	}
	
	@Test
	void parseMissingArgumentShouldReturnFalse() {
		var result = ArgsParser.parse("f?,j#,w*", "-j123 -wSomeText", 'f');
		
		assertEquals(Boolean.FALSE, result);
	}
}
