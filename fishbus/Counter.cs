namespace Fishbus;

public class Counter
{
    private readonly IDisplay _display;

    public Counter(IDisplay display)
    {
        this._display = display;
    }

    public void ListNumbersWithFizzBuzz()
    {
        for (var i = 1; i <= 100; i++)
        {
            bool canConvert = FizzBuzz.TryConvertNumberToWord(i, out string outcome);

            if (canConvert)
            {
                _display.Print(outcome);
            }
            else
            {
                _display.Print(i);
            }
        }
    }
}