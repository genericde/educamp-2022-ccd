package roman_numbers;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class RomanNumeralsTest {
  List<Map.Entry<String, Long>> romanNumeralsToTest = new ArrayList<>();

  private void setUp() {
    romanNumeralsToTest.add(createEntry("I", 1L));
    romanNumeralsToTest.add(createEntry("II", 2L));
    romanNumeralsToTest.add(createEntry("IV", 4L));
    romanNumeralsToTest.add(createEntry("XIII", 13L));
    romanNumeralsToTest.add(createEntry("XLII", 42L));
  }
  
  public void test() {
    setUp();

    int totalTests = romanNumeralsToTest.size();
    int passedTests = 0;

    RomanNumerals rN = new RomanNumerals();

    Iterator<Map.Entry<String, Long>> i = romanNumeralsToTest.iterator();

    while (i.hasNext()) {
      Entry<String, Long> romanNumeralToTest = i.next();
      long translatedValue = rN.translateRomanNumeral(romanNumeralToTest.getKey());
      if (translatedValue != romanNumeralToTest.getValue()) {
        System.out.println("Failed to translate " + romanNumeralToTest.getKey() + " to " + romanNumeralToTest.getValue() + ". Got " + translatedValue + ".");
      } else {
        passedTests += 1;
      }
    }

    System.out.println("Successfully ran " + passedTests + " of " + totalTests + " tests.");
  }

  private Entry<String, Long> createEntry(String s, Long l) {
    return new AbstractMap.SimpleEntry<>(s,l);
  }
}
