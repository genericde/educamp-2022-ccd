using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Exam4
{
	public static class FileFilter
	{
		public static List<string> Filter(string[] fileContent)
		{
			var arrList = fileContent.ToList();
			var itemsToRemove = new List<string>();

			arrList.RemoveAll(x => x.Contains("//") || string.IsNullOrEmpty(x));

			return arrList;
		}
	}
}
