using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Exam3
{
	public class Printer
	{
		public bool PrintNumbers(List<string> numbers)
		{
			try
			{
				Console.WriteLine("Your numbers: {0}", string.Join("", numbers));
				return true;
			}
			catch (Exception ex)
			{
				Console.Error.WriteLine("Failed to log numbers, see ex: ", ex);
				return false;
			}
		}
	}
}
