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

			var isFizz = currentCount % 3 == 0;
			var isBuzz = currentCount % 5 == 0;

			if (isFizz && isBuzz)
			{
				result.IsFizz = true;
				result.IsBuzz = true;
			}
			else if (isFizz)
			{
				result.IsFizz = true;
			}
			else if (isBuzz)
			{
				result.IsBuzz = true;
			}

			return result;
		}
	}
}
