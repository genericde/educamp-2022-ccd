using System;

namespace Exam5
{
	class Program
	{
		static void Main(string[] args)
		{
			Console.WriteLine("Start App!");

			var schemaParser = new SchemaParser();
			schemaParser.Parse("f?,j#,w*", "-f -j123 -wSomeText");

			Console.WriteLine("End App!");
		}
	}
}
