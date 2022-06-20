namespace Fishbus;

public static class Fizz
{
    public static bool CanConvert(int number)
    {
        return number % 3 == 0;
    }

    public static readonly string Value = "Fizz"; 
}