using MoreLinq;

namespace FromRomanNumeral;

public static class RomanNumeralConverter
{
    public static int Convert(string romanNumeral)
    {
        RomanNumeralValidator.ThrowIfInvalid(romanNumeral);
        var numbers = romanNumeral.Select(ConvertToNumbers);
        return SumRomanNumbers(numbers);
    }

    private static int ConvertToNumbers(char literal)
    {
        return literal switch
        {
            'I' => 1,
            'V' => 5,
            'X' => 10,
            'L' => 50,
            'C' => 100,
            'D' => 500,
            'M' => 1000,
            _ => throw new InvalidOperationException($"Did not expect {literal}")
        };
    }

    private static int SumRomanNumbers(IEnumerable<int> numbers)
    {
        var signedNumbers = numbers.Lead(1, SignNumber);
        return signedNumbers.Sum();
    }

    private static int SignNumber(int i1, int i2)
    {
        var numberShouldBeSubtracted = i2 > i1;
        return numberShouldBeSubtracted ? -i1 : i1;
    }
}