namespace LocCount;

public static class Program
{
    public static void Main(string[] args)
    {
        var linesOfCode = File.ReadLines(args[0]);
        var numberOfLinesOfCode = LocCounter.CountLinesOfCode(linesOfCode);
        Console.WriteLine(numberOfLinesOfCode);
    }
}