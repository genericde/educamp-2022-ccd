using MondayCleanCodeKurse;
using Xunit;

namespace MondayCleanCodeKurseTests
{
    public class FizzBuzzCreatorTest
    {
        public FizzBuzzCreator Sut = new FizzBuzzCreator();


        [Theory]
        [InlineData(15, "FizzBuzz")]
        [InlineData(5, "Buzz")]
        [InlineData(3, "Fizz")]
        [InlineData(7, "7")]
        public void FizzBuzzConverter_shoukd_convert_data(int data, string expected)
        {
            var result = Sut.FizzBuzzConverter(data);
            Assert.Equal(expected, result);
        }
    }
}