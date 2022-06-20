using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Exam4
{
	public static class LockCounter
	{
		public static void Count()
		{
			var fileContent = Reader.Read("TestFile.txt");
			var filteredFileContent = FileFilter.Filter(fileContent);
			var counter = FileCounter.Count(filteredFileContent);
			Printer.Print(counter);
		}
	}
}
