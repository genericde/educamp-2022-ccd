namespace FizzBuzz;

public static class FizzBuzzConverter
{
    public static string Convert(int number)
    {
        var isFizz = number % 3 == 0;
        var isBuzz = number % 5 == 0;
        var isFizzBuzz = isFizz && isBuzz;

        if (isFizzBuzz) return "FizzBuzz";
        if (isBuzz) return "Buzz";
        if (isFizz) return "Fizz";
        return number.ToString();
    }
}