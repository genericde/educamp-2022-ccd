using System;
using Xunit;

namespace FizzBuzz.Tests
{
    public class UnitTest1
    {

        [Fact]
        public void TestReplaceDivisble()
        {
            Assert.Equal("Buzz", Program.ReplaceDivisble(5, 5));
            Assert.Equal(String.Empty, Program.ReplaceDivisble(16, 5));
            Assert.Equal("Buzz", Program.ReplaceDivisble(35, 5));
            Assert.Equal("Buzz", Program.ReplaceDivisble(85, 5));
            Assert.Equal(String.Empty, Program.ReplaceDivisble(7, 5));
            Assert.Equal(String.Empty, Program.ReplaceDivisble(9, 5));
            Assert.Equal("Fizz", Program.ReplaceDivisble(9, 3));
            Assert.Equal("Fizz", Program.ReplaceDivisble(18, 3));
            Assert.Equal("Fizz", Program.ReplaceDivisble(3, 3));
            Assert.Equal(String.Empty, Program.ReplaceDivisble(7, 3));
            Assert.Equal(String.Empty, Program.ReplaceDivisble(23, 3));
        }

        [Fact]        
        public void TestReplaceNumber()
        {
            Assert.Equal("Buzz", Program.replaceNumber(5));
            Assert.Equal("16", Program.replaceNumber(16));
            Assert.Equal("Buzz", Program.replaceNumber(35));
            Assert.Equal("Buzz", Program.replaceNumber(85));
            Assert.Equal("7", Program.replaceNumber(7));
            Assert.Equal("FizzBuzz", Program.replaceNumber(15));
            Assert.Equal("FizzBuzz", Program.replaceNumber(45));
            Assert.Equal("FizzBuzz", Program.replaceNumber(60));

        }
        [Fact]
        public void TestConcatResults()
        {
            Assert.Equal("Buzz", Program.concatResults("B", "uzz"));
            Assert.Equal("FizzBuzz", Program.concatResults("Fizz", "Buzz"));
            Assert.Equal("Wednesday", Program.concatResults("Wedne", "sday"));

        }
    }
}
