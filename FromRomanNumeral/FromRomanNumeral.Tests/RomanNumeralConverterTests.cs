namespace FromRomanNumeral.Tests;

public class RomanNumeralConverterTests
{
    [TestCase("I", 1)]
    [TestCase("II", 2)]
    [TestCase("IV", 4)]
    [TestCase("V", 5)]
    [TestCase("IX", 9)]
    [TestCase("XLII", 42)]
    [TestCase("XCIX", 99)]
    [TestCase("MMXXII", 2022)]
    [TestCase("DXXIV", 524)]
    [TestCase("XIX", 19)]
    [TestCase("VI", 6)]
    [TestCase("MCMLXXXII", 1982)]
    [TestCase("", 0)]
    public void ConvertShouldProduceExpectedResult(string romanNumeral, int expected)
    {
        var actual = RomanNumeralConverter.Convert(romanNumeral);
        Assert.That(actual, Is.EqualTo(expected));
    }

    [Test]
    public void ConvertShouldThrowExceptionOnInvalidNumeral()
    {
        var action = () => RomanNumeralConverter.Convert("IIII");
        Assert.Throws<InvalidOperationException>(() => action());
    }
}