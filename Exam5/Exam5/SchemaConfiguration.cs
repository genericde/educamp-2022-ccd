using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Exam5
{
	public static class SchemaConfiguration
	{
		public static List<KeyValuePair<string, string>> GetList()
		{
			var list = new List<KeyValuePair<string, string>>();
			list.Add(new KeyValuePair<string, string>("boolean", "?"));
			list.Add(new KeyValuePair<string, string>("integer", "#"));
			list.Add(new KeyValuePair<string, string>("string", "*"));

			return list;
		}
	}
}
