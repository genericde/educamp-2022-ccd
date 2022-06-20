public static class FizzBuzzConverter
{
    public static string Convert(int number)
    {
        if (IsFizz(number) && IsBuzz(number)) return "FizzBuzz";
        else if (IsFizz(number)) return "Fizz";
        else if (IsBuzz(number)) return "Buzz";
        else return null;
    }

    private static bool IsFizz(int number)
    {
        return number % 5 == 0;
    }

    private static bool IsBuzz(int number)
    {
        return number % 3 == 0;
    }
}