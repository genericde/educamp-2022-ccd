using System;

namespace ArgsParser
{
    internal class Program
    {
        public readonly static string schema = "f?,j#,w*";
        public readonly static string arguments = "-f -j123 -wSomeText";

        static void Main(string[] args)
        {
            var result = ArgsParser.getTypedArguments(schema, arguments);
        }
    }
}
