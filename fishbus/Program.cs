namespace Fishbus;

public class Program
{
    public static void Main()
    {
        IDisplay consoleDisplay = new ConsoleDisplay();
        Counter counter = new Counter(consoleDisplay);

        counter.ListNumbersWithFizzBuzz();
    }

}