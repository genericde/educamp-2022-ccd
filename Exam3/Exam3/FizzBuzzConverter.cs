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
				if (IsFizz(number) && IsBuzz(number))
				{
					result.Add("FizzBuzz");
				}
				else if (IsFizz(number))
				{
					result.Add("Fizz");
				}
				else if (IsBuzz(number))
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

		private static bool IsFizz(int currentCount)
		{
			return currentCount % 3 == 0;
		}


		private static bool IsBuzz(int currentCount)
		{
			return currentCount % 5 == 0;
		}
	}
}
