using ArgsParser;
using System;
using Xunit;

namespace ArgsParserTest
{
    public class ArgsParserTest
    {
        [Fact]
        public void TestTypeParser()
        {
            Assert.Equal(typeof(Boolean), SchemaParser.parseType('?'));
            Assert.Equal(typeof(String), SchemaParser.parseType('*'));
            Assert.Equal(typeof(Int32), SchemaParser.parseType('#'));
        }
    }
}
