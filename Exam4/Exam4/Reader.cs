using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Exam4
{
	public static class Reader
	{
		public static string[] Read(string fileName)
		{
			string[] fileContent = System.IO.File.ReadAllLines(@"C:\Users\kubilay-kenan.dag\TestFile.txt");
			return fileContent;
		}
	}
}
