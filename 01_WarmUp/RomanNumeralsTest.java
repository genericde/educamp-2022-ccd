import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

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
