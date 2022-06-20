public static class FizzBuzzConverter
{
    public static string Convert(int number)
    {
        if(number % 5 == 0 && number % 3 == 0) return "FizzBuzz";
        else if (number % 5 == 0) return "Fizz";
        else if (number % 3 == 0) return "Buzz";
        else return null;
    }
}