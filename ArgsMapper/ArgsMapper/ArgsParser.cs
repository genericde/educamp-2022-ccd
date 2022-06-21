using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ArgsParser
{
    public static class ArgsParser
    {
        public static Dictionary<char, dynamic> getTypedArguments(string schemaDefinition, string arguments) 
        {
            var schema = SchemaParser.Parse(schemaDefinition);
            var typedArguments = ArgumentsParser.Parse(schema, arguments);
            return typedArguments;
        }
    }
}
