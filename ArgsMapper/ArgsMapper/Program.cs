using System;

namespace ArgsParser
{
    internal class Program
    {
        static void Main(string[] args)
        {
            var result = ArgsParser.getTypedArguments("f?,j#,w*", "-f -j123 -wSomeText");
        }
    }
}
