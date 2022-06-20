namespace Fishbus;

public static class Buzz
{
    public static bool CanConvert(int number)
    {
        return number % 5 == 0;
    }

    public static readonly string Value = "Buzz";
}