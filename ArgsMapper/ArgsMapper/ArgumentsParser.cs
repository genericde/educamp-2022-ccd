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
                    if (schema[argument[0]] == typeof(Boolean)) {
                        result.Add(argument[0], true);
                    }
                    else if (schema[argument[0]] == typeof(Int32))
                    {
                        result.Add(argument[0], Convert.ToInt32(argument.Substring(1)));

                    }
                    else if (schema[argument[0]] == typeof(String))
                    {
                        result.Add(argument[0], argument.Substring(1));

                    }
                }
            }
            return result;
        }
    }
}
