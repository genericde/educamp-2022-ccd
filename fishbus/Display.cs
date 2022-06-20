namespace Fishbus;

public class ConsoleDisplay : IDisplay
{
    public void Print(object value)
    {
        Console.WriteLine(value);
    }
}