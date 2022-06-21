using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Exam5
{
	public class SchemaParser
	{
		public void Parse(string schema, string value)
		{
			var trimmedArguments = TrimArguments(value);
			var arguments = GetArgumentValue(trimmedArguments);

			var schemaArguments = TrimSchemaArguments(schema);

			for (int i = 0; i < arguments.Length; i++)
			{
				var schemaType = GetSchemaType(schemaArguments, i);

				switch (schemaType)
				{
					case "string": Console.WriteLine("Value is a string: " + arguments[i]); break;
					case "integer": Convert.ToInt32(arguments[i]); Console.WriteLine("Value is a Integer: " + arguments[i]); break;
					case "boolean": Console.WriteLine("Value is a Boolean: " + arguments[i]); break;
				}
			}
		}

		private string GetSchemaType(string[] schemaArguments, int index)
		{
			var schemaDefinition = SchemaConfiguration.GetList();
			return schemaDefinition.Find(x => x.Value == schemaArguments[index].Substring(1).ToString()).Key;
		}

		private string[] TrimArguments(string arguments)
		{
			return arguments.Split(" ");
		}

		private string[] TrimSchemaArguments(string schema)
		{
			return schema.Split(",");
		}

		private string[] GetArgumentValue(string[] arguments)
		{
			var result = new string[arguments.Length];

			for (int i = 0; i < arguments.Length; i++)
			{
				result[i] = arguments[i].Substring(2);
			}

			return result;
		}

	}
}
