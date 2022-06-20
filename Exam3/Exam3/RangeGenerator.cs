using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Exam3
{
	public class RangeGenerator
	{
		public List<int> GenerateRange(int startIndex, int endIndex)
		{
			var numbers = new List<int>();

			for (int i = startIndex; i <= endIndex; i++)
			{
				numbers.Add(i);
			}

			return numbers;
		}
	}
}
