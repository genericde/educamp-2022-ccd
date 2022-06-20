using System;
using System.Collections.Generic;
using Xunit;

namespace FizzBuzz.Tests
{
    public class UnitTest1
    {

        [Fact]
        public void TestCreateRange()
        {
            var expectedResults = new List<int>();
            for (int i = 1; i <= 100; i++)
            {
                expectedResults.Add(i); ;
            }
            var rangeCreator = new RangeCreator();
            var results = rangeCreator.GenerateRange();
            Assert.Equal(expectedResults, results);
        }

        [Fact]        
        public void TestConverter()
        {
            var numbers = new List<int>();
            numbers.Add(1);
            numbers.Add(2);
            numbers.Add(3);
            numbers.Add(4);
            numbers.Add(5);
            numbers.Add(6);
            numbers.Add(7);
            numbers.Add(8);
            numbers.Add(9);
            numbers.Add(10);
            numbers.Add(15);
            numbers.Add(45);
            var expectedResults = new List<string>();
            expectedResults.Add("1");
            expectedResults.Add("2");
            expectedResults.Add("Fizz");
            expectedResults.Add("4");
            expectedResults.Add("Buzz");
            expectedResults.Add("Fizz");
            expectedResults.Add("7");
            expectedResults.Add("8");
            expectedResults.Add("Fizz");
            expectedResults.Add("Buzz");
            expectedResults.Add("FizzBuzz");
            expectedResults.Add("FizzBuzz");
            var converter = new FizzBuzzConverter();
            var results = converter.Convert(numbers);
            Assert.Equal(expectedResults, results);


        }

    }
}
