using LocCount;
using System;
using System.Collections.Generic;
using Xunit;

namespace LocCountTest
{
    public class LocCountTest
    {
        [Fact]
        public void TestFilterLinesWithCode()
        {
            TestFilter("Test123", 1);
            TestFilter("Test123 ewqoiowqieoqwc  eqwoiehowqwq jpewqj pqe // ewqoe owqe q&  //", 1);
            TestFilter("x", 1);

        }
        [Fact]
        public void TestFilterLinesWithComment()
        {
            TestFilter("  // This is a comment", 0);
            TestFilter("// This is a comment without spaces", 0);
            TestFilter("                  // This is a comment with lots of spaces", 0);
            TestFilter("  // This is a  looooooooooooooooooooooooooooooooooooooooooooooooooooooooooooong comment", 0);
        }
        [Fact]
        public void TestFilterLinesWithEmptyString()
        {
            TestFilter(String.Empty, 0);
        }

        private void TestFilter(string input, int expectedCount)
        {
            var testList = new List<string>() { input };
            var result = FilterLines.FilterLines(testList);
            Assert.Equal(expectedCount, result.Count);
        }
    }
}
