package argsparser;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Map;

import org.junit.jupiter.api.Test;

class SchemaParserTest {

	@Test
	void parseValidSchemaShouldReturnMap() {
		var result = SchemaParser.parseSchemaSpec("f?,j#,w*");
		
		var expectedResult = Map.of('f', Boolean.class, 'j', Integer.class, 'w', String.class);
		assertEquals(expectedResult, result);
	}
	
	@Test
	void parseInalidSchemaShouldThrow() {
		assertThrows(IllegalArgumentException.class, () -> SchemaParser.parseSchemaSpec("fx,j#,w*"));
	}
}
