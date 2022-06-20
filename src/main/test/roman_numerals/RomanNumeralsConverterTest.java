package roman_numerals;

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
    void convertNumeralsToDecimalThrowsErrorWhenLiteralIsRepeatedToOften() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> RomanNumeralConverter.convertNumeralToDecimal("IIIV"));
        Assertions.assertThrows(IllegalArgumentException.class, () -> RomanNumeralConverter.convertNumeralToDecimal("VVX"));
        Assertions.assertThrows(IllegalArgumentException.class, () -> RomanNumeralConverter.convertNumeralToDecimal("XXL"));
        Assertions.assertThrows(IllegalArgumentException.class, () -> RomanNumeralConverter.convertNumeralToDecimal("LLC"));
        Assertions.assertThrows(IllegalArgumentException.class, () -> RomanNumeralConverter.convertNumeralToDecimal("CCD"));
        Assertions.assertThrows(IllegalArgumentException.class, () -> RomanNumeralConverter.convertNumeralToDecimal("CCD"));
        Assertions.assertThrows(IllegalArgumentException.class, () -> RomanNumeralConverter.convertNumeralToDecimal("DDM"));
    }

}
