using NUnit.Framework;

namespace FizzBuzz.Tests;

public class FizzBuzzLogicTests
{
    [TestCase(1, "1")]
    [TestCase(2, "2")]
    [TestCase(3, "Fizz")]
    [TestCase(5, "Buzz")]
    [TestCase(15, "FizzBuzz")]
    public void ConvertToFizzBuzzTests(int input, string expected)
    {
        var actual = FizzBuzzLogic.ConvertToFizzBuzz(input);
        Assert.AreEqual(expected, actual);
    }
}