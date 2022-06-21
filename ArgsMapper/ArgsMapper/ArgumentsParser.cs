using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ArgsParser
{
    public static class ArgumentsParser
    {
        public static Dictionary<char, dynamic> Parse(Dictionary<char, Type> schema, string arguments)
        {
            Dictionary<char, dynamic> result = new Dictionary<char, dynamic>();
            var argumentArray = arguments.Split('-', StringSplitOptions.RemoveEmptyEntries);
            foreach (var argument in argumentArray)
            {
                var argumentName = argument[0];
                var argumentValue = argument.Substring(1);
                if (schema.ContainsKey(argumentName))
                {
                    result.Add(argumentName, parseSingleArgument(schema[argumentName], argumentValue));
                }
            }
            return result;
        }
        public static dynamic parseSingleArgument(Type type, string value)
        {
            if (type == typeof(Boolean))
            {
                return true;
            }
            else if (type == typeof(Int32))
            {
                return Convert.ToInt32(value);
            }
            else if (type == typeof(String))
            {
                return value;
            }
            return false;
        }
    }
}

