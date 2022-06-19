using System.Text.RegularExpressions;

namespace FromRomanNumeral;

public static class RomanNumeralValidator
{
    private static readonly Regex RomanNumeralRegex = new("^M{0,4}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$");

    public static void ThrowIfInvalid(string romanNumeral)
    {
        var isValid = RomanNumeralRegex.IsMatch(romanNumeral);
        if (isValid is false)
        {
            throw new InvalidOperationException($"The string {romanNumeral} is not a valid romanNumeral");
        }
    }
}