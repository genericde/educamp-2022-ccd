package argsparser;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class ArgsParserTest {

	@Test
	void parseValidArgumentShouldReturnBoolean() {
		var result = ArgsParser.parse("f?,j#,w*", "-f -j123 -wSomeText", 'f');
		
		assertTrue(result instanceof Boolean);
		assertEquals(Boolean.TRUE, result);
	}
	
	@Test
	void parseValidArgumentShouldReturnInteger() {
		var result = ArgsParser.parse("f?,j#,w*", "-f -j123 -wSomeText", 'j');
		
		assertTrue(result instanceof Integer);
		assertEquals(123, result);
	}
	
	@Test
	void parseValidArgumentShouldReturnString() {
		var result = ArgsParser.parse("f?,j#,w*", "-f -j123 -wSomeText", 'w');
		
		assertTrue(result instanceof String);
		assertEquals("SomeText", result);
	}
	
	@Test
	void parseMissingArgumentShouldReturnNull() {
		var result = ArgsParser.parse("f?,j#,w*", "-j123 -wSomeText", 'f');
		
		assertNull(result);
	}
}
