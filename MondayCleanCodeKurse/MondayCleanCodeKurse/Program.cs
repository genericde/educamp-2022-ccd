using ArgsParser;
using LocCounter;

Console.WriteLine("CodeLineCounter List!");

//var locCounter = new CodeLineCounter();
//Console.WriteLine(locCounter.NumberOfCodeLines(Directory.GetCurrentDirectory() + "/code.txt"));

var argsParse = new ArgParserFromSchema();
argsParse.GetArg("", "", "f");

Console.WriteLine();
Console.WriteLine("Press any button...");
Console.ReadKey();