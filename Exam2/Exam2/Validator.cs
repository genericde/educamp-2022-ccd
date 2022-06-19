using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Exam2
{
	public class Validator : IValidator
	{
		public ValidationResult ValidateCount(int currentCount)
		{
			var result = new ValidationResult();

			if (isFizz(currentCount) && isBuzz(currentCount))
			{
				result.IsFizz = true;
				result.IsBuzz = true;
			}
			else if (isFizz(currentCount))
			{
				result.IsFizz = true;
			}
			else if (isBuzz(currentCount))
			{
				result.IsBuzz = true;
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
