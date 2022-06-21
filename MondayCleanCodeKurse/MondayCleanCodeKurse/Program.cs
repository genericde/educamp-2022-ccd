using LocCounter;

Console.WriteLine("CodeLineCounter List!");

var locCounter = new CodeLineCounter();
Console.WriteLine(locCounter.NumberOfCodeLines(Directory.GetCurrentDirectory() + "/code.txt"));

Console.WriteLine();
Console.WriteLine("Press any button...");
Console.ReadKey();