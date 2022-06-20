namespace Fishbus;

public static class FizzBuzz
{
    public static bool TryConvertNumberToWord(int number, out string outcome)
    {
        bool canConvertToFizz = Fizz.CanConvert(number);
        bool canConvertToBuzz = Buzz.CanConvert(number);

        if (canConvertToBuzz && canConvertToFizz)
        {
            outcome = Fizz.Value + Buzz.Value;
            return true;
        }
        else if (canConvertToFizz)
        {
            outcome = Fizz.Value;
            return true;
        }
        else if (canConvertToBuzz)
        {
            outcome = Buzz.Value;
            return true;
        }

        outcome = "";
        return false;
    }
}