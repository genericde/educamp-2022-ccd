using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Exam4
{
	public static class Reader
	{
		public static string[] Read(string fileName)
		{
			try
			{
				string[] fileContent = File.ReadAllLines(@"C:\Users\kubilay-kenan.dag\TestFile.txt");
				return fileContent;
			}
			catch (IOException ex)
			{
				Console.Error.WriteLine(ex);
				throw;
			}
		}
	}
}
