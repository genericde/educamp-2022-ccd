namespace RomanNumerals.Tests;
using RomanNumerals;

public class RomanNumeralsTest
{
    [Theory]
    [InlineData("I", 1)]
    [InlineData("II", 2)]
    [InlineData("IV", 4)]
    [InlineData("V", 5)]
    [InlineData("IX", 9)]
    [InlineData("XLII", 42)]
    [InlineData("XCIX", 99)]
    [InlineData("MMXXII", 2022)]
    public void RomanNumberCanConvertCorrectly(string romanNumber, int expectedResult)
    {
        RomanNumeralsConverter rnc = new RomanNumeralsConverter();

        int result = rnc.RomanNumberToDecimal(romanNumber);

        Assert.Equal(expectedResult, result);
    }

    [Fact]
    public void ExcpetionGetsThrownOnInvalidRomanNumeral()
    {
        RomanNumeralsConverter rnc = new RomanNumeralsConverter();

        Assert.Throws<InvalidOperationException>(() => rnc.RomanNumberToDecimal("asb"));
    }
}