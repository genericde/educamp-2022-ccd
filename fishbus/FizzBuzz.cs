namespace Fishbus;

public class FizzBuzz : IFizzBuzz
{
    private readonly Fizz _fizz;
    private readonly Buzz _buzz;

    public FizzBuzz(Fizz fizz, Buzz buzz)
    {
        _fizz = fizz;
        _buzz = buzz;
    }

    public bool TryConvert(int number, out string outcome)
    {
        bool canConvertToFizz = _fizz.CanConvert(number);
        bool canConvertToBuzz = _buzz.CanConvert(number);

        if (canConvertToBuzz && canConvertToFizz)
        {
            outcome = Fizz.Value + Buzz.Value;
            return true;
        }
        else if (canConvertToFizz)
        {
            outcome = Buzz.Value;
            return true;
        }
        else if (canConvertToBuzz)
        {
            outcome = Fizz.Value;
            return true;
        }

        outcome = "";
        return false;
    }
}