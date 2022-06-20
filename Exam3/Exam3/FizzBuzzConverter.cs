using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Exam3
{
	class FizzBuzzConverter
	{
		public List<string> ConvertNumber(List<int> numbers)
		{
			var result = new List<string>();

			foreach (var number in numbers)
			{
				if (isFizz(number) && isBuzz(number))
				{
					result.Add("FizzBuzz");
				}
				else if (isFizz(number))
				{
					result.Add("Fizz");
				}
				else if (isBuzz(number))
				{
					result.Add("Buzz");
				}
				else
				{
					result.Add(number.ToString());
				}
			}

			return result;

		}

		private static bool isFizz(int currentCount)
		{
			return currentCount % 3 == 0;
		}


		private static bool isBuzz(int currentCount)
		{
			return currentCount % 5 == 0;
		}
	}
}
