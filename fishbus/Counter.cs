namespace Fishbus;

public class Counter
{
    private readonly IFizzBuzz _fizzBuzz;

    public Counter(IFizzBuzz fizzBuzz)
    {
        this._fizzBuzz = fizzBuzz;
    }

    public void ListNumbers(int start, int end)
    {
        for (var i = start; i < end; i++)
        {
            bool canConvert = _fizzBuzz.TryConvert(i, out string outcome);

            if (canConvert)
            {
                Console.WriteLine(outcome);
            }
            else
            {
                Console.WriteLine(i);
            }
        }
    }
}