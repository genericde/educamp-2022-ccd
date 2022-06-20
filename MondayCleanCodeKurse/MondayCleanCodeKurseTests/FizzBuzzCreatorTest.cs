using MondayCleanCodeCourse;
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
        public void FizzBuzzConverter_should_convert_data(int data, string expected)
        {
            var result = Sut.FizzBuzzConverter(data);
            Assert.Equal(expected, result);
        }

        [Theory]
        [InlineData(15)]
        [InlineData(100)]
        [InlineData(1500)]
        [InlineData(0)]
        public void RangeCreator_should_create_range(int size)
        {
            var result = Sut.RangeCreator(size);
            Assert.Equal(result.Count(),size);
        }
    }
}