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
            List<int> testList = new List<int>();
            for (int i = 1; i <= 100; i++)
            {
                testList.Add(i); ;
            }
            RangeCreator rangeCreator = new RangeCreator();
            Assert.Equal(testList, rangeCreator.GenerateRange());
        }

        [Fact]        
        public void TestConverter()
        {
            List<int> testList = new List<int>();
            testList.Add(1);
            testList.Add(2);
            testList.Add(3);
            testList.Add(4);
            testList.Add(5);
            testList.Add(6);
            testList.Add(7);
            testList.Add(8);
            testList.Add(9);
            testList.Add(10);
            testList.Add(15);
            testList.Add(45);
            List<String> testList2 = new List<string>();
            testList2.Add("1");
            testList2.Add("2");
            testList2.Add("Fizz");
            testList2.Add("4");
            testList2.Add("Buzz");
            testList2.Add("Fizz");
            testList2.Add("7");
            testList2.Add("8");
            testList2.Add("Fizz");
            testList2.Add("Buzz");
            testList2.Add("FizzBuzz");
            testList2.Add("FizzBuzz");
            FizzBuzzConverter converter = new FizzBuzzConverter();
            Assert.Equal(testList2, converter.Convert(testList));


        }

    }
}
