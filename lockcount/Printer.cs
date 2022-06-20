public class Printer : IPrinter
{
    public void Print(int lineCount)
    {
        Console.WriteLine(lineCount);
    }
}