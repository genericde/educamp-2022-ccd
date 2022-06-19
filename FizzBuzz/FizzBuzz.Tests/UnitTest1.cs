using System;
using Xunit;

namespace FizzBuzz.Tests
{
    public class UnitTest1
    {
        [Fact]
        public void TestReplaceDivisbleByThree()
        {
            Assert.Equal("Fizz", Program.ReplaceDivisbleByThree(9));
            Assert.Equal("Fizz", Program.ReplaceDivisbleByThree(18));
            Assert.Equal("Fizz", Program.ReplaceDivisbleByThree(3));
            Assert.Equal(String.Empty, Program.ReplaceDivisbleByThree(7));
            Assert.Equal(String.Empty, Program.ReplaceDivisbleByThree(23));
        }

        [Fact]
        public void TestReplaceDivisbleByFive()
        {
            Assert.Equal("Buzz", Program.ReplaceDivisbleByFive(5));
            Assert.Equal(String.Empty, Program.ReplaceDivisbleByFive(16));
            Assert.Equal("Buzz", Program.ReplaceDivisbleByFive(35));
            Assert.Equal("Buzz", Program.ReplaceDivisbleByFive(85));
            Assert.Equal(String.Empty, Program.ReplaceDivisbleByFive(7));
            Assert.Equal(String.Empty, Program.ReplaceDivisbleByFive(9));
        }

        [Fact]        public void TestReplaceNumber()
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
    }
}
