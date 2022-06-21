package ch.markusborer.argparser;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ArgParserTest {

    @Test
    void parse() {
        Object result = ArgParser.parse("a*,b?,c#", "-aSomeText -b -c123", "c");
        assertEquals(Integer.class, result.getClass());
        assertTrue(result.equals(123));
    }

    @Test
    void parseSchema() {
        Map<String, TypeParser> parsedSchema = ArgParser.parseSchema("a*,b?,c#");
        assertEquals(3, parsedSchema.keySet().size());
        assertEquals(StringTypeParser.class, parsedSchema.get("a").getClass());
        assertEquals(BooleanTypeParser.class, parsedSchema.get("b").getClass());
        assertEquals(IntegerTypeParser.class, parsedSchema.get("c").getClass());
    }

    @Test
    void parseSchemaThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> ArgParser.parseSchema("a*,b?,c#,d!"));
        assertThrows(IllegalArgumentException.class, () -> ArgParser.parseSchema("a*,b?,c#,a?"));
    }

    @Test
    void parseArguments() {
        Map<String, TypeParser> parsedSchema = new HashMap<>();
        parsedSchema.put("a", new StringTypeParser());
        parsedSchema.put("b", new BooleanTypeParser());
        parsedSchema.put("c", new IntegerTypeParser());
        String arguments = "-aSomeText -b -c123";
        Map<String, Object> parsedArguments = ArgParser.parseArguments(parsedSchema, arguments);
        assertEquals(String.class, parsedArguments.get("a").getClass());
        assertEquals(Boolean.class, parsedArguments.get("b").getClass());
        assertEquals(Integer.class, parsedArguments.get("c").getClass());
        assertTrue(parsedArguments.get("a").equals("SomeText"));
        assertTrue(parsedArguments.get("b").equals(true));
        assertTrue(parsedArguments.get("c").equals(123));
    }

    @Test
    void parseArgumentsThrowsException() {
        Map<String, TypeParser> parsedSchema = new HashMap<>();
        parsedSchema.put("a", new StringTypeParser());
        parsedSchema.put("b", new BooleanTypeParser());
        parsedSchema.put("c", new IntegerTypeParser());
        assertThrows(IllegalArgumentException.class, () -> ArgParser.parseArguments(parsedSchema, "-"));
        assertThrows(IllegalArgumentException.class, () -> ArgParser.parseArguments(parsedSchema, "+aSomeText"));
        assertThrows(IllegalArgumentException.class, () -> ArgParser.parseArguments(parsedSchema, "-btrue"));
        assertThrows(IllegalArgumentException.class, () -> ArgParser.parseArguments(parsedSchema, "-cSomeText"));
        assertThrows(IllegalArgumentException.class, () -> ArgParser.parseArguments(parsedSchema, "-d123"));
        assertThrows(IllegalArgumentException.class, () -> ArgParser.parseArguments(parsedSchema, "-aSomeText -aSecondText"));
    }

    @Test
    void getSelectedArgument() {
        Map<String, Object> parsedArguments = new HashMap<>();
        parsedArguments.put("a", "A String");
        parsedArguments.put("b", true);
        parsedArguments.put("c", 123);
        assertEquals("A String", ArgParser.getSelectedArgument(parsedArguments, "a"));
        assertEquals(true, ArgParser.getSelectedArgument(parsedArguments, "b"));
        assertEquals(123, ArgParser.getSelectedArgument(parsedArguments, "c"));
    }

    @Test
    void getSelectedArgumentThrowsException() {
        Map<String, Object> parsedArguments = new HashMap<>();
        parsedArguments.put("a", "A String");
        parsedArguments.put("b", true);
        parsedArguments.put("c", 123);
        assertThrows(IllegalArgumentException.class, () -> ArgParser.getSelectedArgument(parsedArguments, "d"));
    }
}