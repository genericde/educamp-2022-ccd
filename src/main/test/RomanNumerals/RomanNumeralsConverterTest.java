package RomanNumerals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanNumeralsConverterTest {

    @Test
    void convertNumeralsToDecimal() {
        Assertions.assertEquals(1, RomanNumeralConverter.convertNumeralToDecimal("I"));
        Assertions.assertEquals(2, RomanNumeralConverter.convertNumeralToDecimal("II"));
        Assertions.assertEquals(4, RomanNumeralConverter.convertNumeralToDecimal("IV"));
        Assertions.assertEquals(5, RomanNumeralConverter.convertNumeralToDecimal("V"));
        Assertions.assertEquals(9, RomanNumeralConverter.convertNumeralToDecimal("IX"));
        Assertions.assertEquals(42, RomanNumeralConverter.convertNumeralToDecimal("XLII"));
        Assertions.assertEquals(99, RomanNumeralConverter.convertNumeralToDecimal("XCIX"));
        Assertions.assertEquals(2022, RomanNumeralConverter.convertNumeralToDecimal("MMXXII"));
    }

    @Test
    void convertNumeralsToDecimalThrowsErrorWhenInvalidNumeralIsGiven() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> RomanNumeralConverter.convertNumeralToDecimal("P"));
    }

    @Test
    void convertNumeralToDecimal() {
        Assertions.assertEquals(1, RomanNumeralConverter.convertLiteralToDecimal((byte) 'I'));
        Assertions.assertEquals(5, RomanNumeralConverter.convertLiteralToDecimal((byte) 'V'));
        Assertions.assertEquals(10, RomanNumeralConverter.convertLiteralToDecimal((byte) 'X'));
        Assertions.assertEquals(50, RomanNumeralConverter.convertLiteralToDecimal((byte) 'L'));
        Assertions.assertEquals(100, RomanNumeralConverter.convertLiteralToDecimal((byte) 'C'));
        Assertions.assertEquals(500, RomanNumeralConverter.convertLiteralToDecimal((byte) 'D'));
        Assertions.assertEquals(1000, RomanNumeralConverter.convertLiteralToDecimal((byte) 'M'));
    }

    @Test
    void convertNumeralToDecimalThrowsErrorWhenInvalidNumeralIsGiven() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> RomanNumeralConverter.convertLiteralToDecimal((byte) 'P'));
    }

}
