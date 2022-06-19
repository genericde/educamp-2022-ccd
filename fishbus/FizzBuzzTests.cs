namespace Fishbus;
using Xunit;

public class FizzBuzzTests
{
    [Fact]
    public void FizzReturnsTrueOnNumberThreeDivisible()
    {
        Fizz fizz = new Fizz();

        bool returnedTrue = fizz.CanConvert(3);

        Assert.True(returnedTrue);
    }

    [Fact]
    public void BuzzReturnsTrueOnNumberFiveDivisible()
    {
        Buzz buzz = new Buzz();

        bool returnedTrue = buzz.CanConvert(5);

        Assert.True(returnedTrue);
    }

    [Fact]
    public void FizzBuzzReturnsFizzBuzzOnNumberThreeAndFiveDivisible()
    {
        Fizz fizz = new Fizz();
        Buzz buzz = new Buzz();
        FizzBuzz fizzBuzz = new FizzBuzz(fizz, buzz);

        bool canConvert = fizzBuzz.TryConvert(30, out string outcome);

        Assert.True(canConvert);
        Assert.Equal("FizzBuzz", outcome);
    }
}