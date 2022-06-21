package test.java.argsparser;

import org.junit.Test;

import static main.java.argsparser.ArgsParserIntergration.getValueForSchema;
import static org.junit.Assert.assertEquals;

public class ArgsParserTest {
    @Test
    public void testArgsParserWIthNumberValue() {
        Object valueForSchema = getValueForSchema("a?,b#,c*", "-a -b123 -cSomeText", "a");
        assertEquals(true, valueForSchema);
    }

    @Test
    public void testArgsParserWithStringValue() {
        Object valueForSchema = getValueForSchema("x?,y#,z*", "-x -y123 -zSomeText", "z");
        assertEquals("SomeText", valueForSchema);
    }

    @Test
    public void testArgsParserWithBooleanValue() {
        Object valueForSchema = getValueForSchema("f?,j#,w*", "-f -j123 -wSomeText", "j");
        assertEquals(123, valueForSchema);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testArgsParserWithInvalidSchemaLetter() {
        Object valueForSchema = getValueForSchema("f?,j#,w&", "", "");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testArgsParserWithInvalidValueLetter() {
        Object valueForSchema = getValueForSchema("a?,b#,c*", "-a -b123 -zSomeText", "");
    }

}
