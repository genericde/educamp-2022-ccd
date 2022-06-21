using ArgsParser;
using System;
using System.Collections.Generic;
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

        [Fact]
        public void TestSchemaParser()
        {
            var expectedResult = new Dictionary<char, Type>
            {
                { 'x', typeof(Boolean) },
                { 's', typeof(String) },
                { 'r', typeof(Boolean) },
                { 'p', typeof(Int32) },
                { 'w', typeof(String) }
            };
            var result = SchemaParser.Parse("x?,s*,r?,p#,w*");
            Assert.Equal(expectedResult, result);
        }
        [Fact]
        public void TestParseArgument()
        {
            Assert.Equal("SomeCoolText", ArgumentsParser.parseArgument(typeof(String), "wSomeCoolText"));
            Assert.Equal(213213213, ArgumentsParser.parseArgument(typeof(Int32), "j213213213"));
            Assert.Equal(true, ArgumentsParser.parseArgument(typeof(Boolean), "abc"));
        }
    }
}
