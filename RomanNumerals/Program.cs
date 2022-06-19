namespace RomanNumerals;

public class Program
{

    public static void Main(string[] args)
    {
        if (!args.Any())
        {
            Console.WriteLine("No Arguments supplied! Please run this command and append a roman numeral.");
            return;
        }

        if (args.Count() > 1)
        {
            Console.WriteLine("Too many Arguments supplied! Only one argument is allowed.");
            return;
        }
        RomanNumeralsConverter rmc = new RomanNumeralsConverter();

        int result = rmc.RomanNumberToDecimal(args[0]);

        Console.WriteLine($"The result Is {result}");
    }
}

