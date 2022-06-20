namespace Fishbus;
using Xunit;

public class FizzBuzzTests
{
    [Fact]
    public void FizzReturnsTrueOnNumberThreeDivisible()
    {
        bool returnedTrue = Fizz.CanConvert(3);

        Assert.True(returnedTrue);
    }

    [Fact]
    public void BuzzReturnsTrueOnNumberFiveDivisible()
    {
        bool returnedTrue = Buzz.CanConvert(5);

        Assert.True(returnedTrue);
    }

    [Fact]
    public void FizzBuzzReturnsFizzBuzzOnNumberThreeAndFiveDivisible()
    {
        bool canConvert = FizzBuzz.TryConvertNumberToWord(30, out string outcome);

        Assert.True(canConvert);
        Assert.Equal("FizzBuzz", outcome);
    }
}