package romanNumbers;

import java.util.HashMap;
import java.util.Map;

public class RomanNumerals {
  private Map<Character, Long> romanNumbers = new HashMap<>();

  public RomanNumerals() {
    romanNumbers.put('I', 1L);
    romanNumbers.put('V', 5L);
    romanNumbers.put('X', 10L);
    romanNumbers.put('L', 50L);
    romanNumbers.put('C', 100L);
    romanNumbers.put('D', 500L);
    romanNumbers.put('M', 1000L);
  }

  public long translateRomanNumeral(String romanNumeral) {
    long result = 0;
    char[] romanCharacters = romanNumeral.toCharArray();

    for (int i = 0; i < romanCharacters.length; i++) {
      if (i+1 < romanCharacters.length && romanNumbers.get(romanCharacters[i]) < romanNumbers.get(romanCharacters[i+1])) {
        result += (romanNumbers.get(romanCharacters[i+1]) - romanNumbers.get(romanCharacters[i]));
        i++;
      } else {
        result += romanNumbers.get(romanCharacters[i]);
      }
    }

    return result;
  }
}
