namespace FromRomanNumeral.Tests;

public class RomanNumeralValidatorTests
{
    [TestCase("I")]
    [TestCase("II")]
    [TestCase("IV")]
    [TestCase("V")]
    [TestCase("IX")]
    [TestCase("XLII")]
    [TestCase("XCIX")]
    [TestCase("MMXXII")]
    [TestCase("DXXIV")]
    [TestCase("")]
    public void ThrowIfInvalidShouldNotThrowOnValid(string romanNumeral)
    {
        TestDelegate action = () => RomanNumeralValidator.ThrowIfInvalid(romanNumeral);
        Assert.DoesNotThrow(action);
    }

    [TestCase("IIII")]
    [TestCase("VIV")]
    [TestCase("IIV")]
    [TestCase("123")]
    [TestCase("v")]
    [TestCase("PIV")]
    [TestCase("?")]
    public void ThrowIfInvalidShouldThrowOnInvalid(string romanNumeral)
    {
        TestDelegate action = () => RomanNumeralValidator.ThrowIfInvalid(romanNumeral);
        Assert.Throws<InvalidOperationException>(action);
    }
}