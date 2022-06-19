namespace Fishbus;

public class Buzz
{
    public bool CanConvert(int number)
    {
        return number % 5 == 0;
    }

    public static readonly string Value = "Buzz";
}