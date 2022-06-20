using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Exam3
{
	public class FizzBuzzIntegration
	{
		private readonly int StartIndex = 1;
		private readonly int EndIndex = 100;

		public void FizzBuzzIntegrationHandler()
		{
			var rangeGenerator = new RangeGenerator();
			var fizzBuzzConverter = new FizzBuzzConverter();
			var printer = new Printer();

			var numbers = rangeGenerator.GenerateRange(StartIndex, EndIndex);
			var convertedNumbers = fizzBuzzConverter.ConvertNumber(numbers);
			_ = printer.PrintNumbers(convertedNumbers);
		}
	}
}
