namespace FizzBuzz;

public class FizzBuzzIntegration
{
    public static void Run(Action<string> display)
    {
        var range = RangeProvider.Provide();
        var fizzBuzzes = range.Select(FizzBuzzLogic.ConvertToFizzBuzz);
        fizzBuzzes.ForEach(display);
    }
}