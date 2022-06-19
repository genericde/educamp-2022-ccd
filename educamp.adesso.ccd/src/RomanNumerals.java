public class RomanNumerals {
  public long translateRomanNumeral(String romanNumeral) {
    long result = 0;
    char[] romanCharacters = romanNumeral.toCharArray();

    for (int i = 0; i < romanCharacters.length; i++) {
      if (i+1 < romanCharacters.length && getDecimalValue(romanCharacters[i]) < getDecimalValue(romanCharacters[i+1])) {
        result += (getDecimalValue(romanCharacters[i+1]) - getDecimalValue(romanCharacters[i]));
        i++;
      } else {
        result += getDecimalValue(romanCharacters[i]);
      }
    }

    return result;
  }

  private long getDecimalValue(char romanNumeral) {
    switch (romanNumeral) {
      case 'I':
      return 1;
      case 'V':
      return 5;
      case 'X':
      return 10;
      case 'L':
      return 50;
      case 'C':
      return 100;
      case 'D':
      return 500;
      case 'M':
      return 1000;
      default:
      throw new IllegalArgumentException();
    }
  }
}
