using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Exam1
{
	public class RomanNumeralDefinition
	{
		public static List<KeyValuePair<char, int>> GetValues()
		{
			var list = new List<KeyValuePair<char, int>>();

			list.Add(new KeyValuePair<char, int>('I',1));
			list.Add(new KeyValuePair<char, int>('V', 5));
			list.Add(new KeyValuePair<char, int>('X', 10));
			list.Add(new KeyValuePair<char, int>('L', 50));
			list.Add(new KeyValuePair<char, int>('C', 100));
			list.Add(new KeyValuePair<char, int>('D', 500));
			list.Add(new KeyValuePair<char, int>('M', 1000));

			return list;
		}
	}
}
