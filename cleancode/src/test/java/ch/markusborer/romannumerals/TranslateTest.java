package ch.markusborer.romannumerals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TranslateTest {


    @Test
    public void test1() {
        assertEquals(1, new Translate().translate("I"));
    }

    @Test
    public void test2() {
        assertEquals(2, new Translate().translate("II"));
    }

    @Test
    public void test4() {
        assertEquals(4, new Translate().translate("IV"));
    }

    @Test
    public void test5() {
        assertEquals(5, new Translate().translate("V"));
    }

    @Test
    public void test9() {
        assertEquals(9, new Translate().translate("IX"));
    }

    @Test
    public void test42() {
        assertEquals(42, new Translate().translate("XLII"));
    }

    @Test
    public void test99() {
        assertEquals(99, new Translate().translate("XCIX"));
    }

    @Test
    public void test2022() {
        assertEquals(2022, new Translate().translate("MMXXII"));
    }

}