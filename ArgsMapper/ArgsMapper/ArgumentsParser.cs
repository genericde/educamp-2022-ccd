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
                if (schema.ContainsKey(argument[0]))
                {
                    result.Add(argument[0], parseSingleArgument(schema[argument[0]], argument));
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
                return Convert.ToInt32(value.Substring(1));
            }
            else if (type == typeof(String))
            {
                return value.Substring(1);
            }
            return false;
        }
    }
}

