using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ArgsParser
{
    public static class SchemaParser
    {
        public static Dictionary<char, Type> Parse (string schema)
        {
            var result = new Dictionary<char, Type>();
            var schemaArray = schema.Split(',');
            foreach (var item in schemaArray)
            {
                result.Add(item[0], parseType(item[1]));
            }
            return result;
        }

        public static Type parseType(char type)
        {
            switch (type)
            {
                case '?':
                    return typeof(Boolean);
                case '#':
                    return typeof(Int32);
                case '*':
                    return typeof(String);
                default:
                    return typeof(Boolean);
            }
        }
    }
}
