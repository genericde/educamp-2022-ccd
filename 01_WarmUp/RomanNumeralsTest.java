import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 * @author ugk (Sokuro Matsuda)
 * @since 6/19/2022
 */
class RomanNumeralsTest {

    RomanNumerals romanNumerals = new RomanNumerals();

    @Test
    void convertRomanToInteger() {
        assertEquals(1, romanNumerals.convertRomanToInteger("I"));
        assertNotEquals(1, romanNumerals.convertRomanToInteger("II"));
    }
}
