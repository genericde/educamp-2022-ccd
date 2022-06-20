namespace FizzBuzz;

public class FizzBuzzIntegration
{
    private readonly Printer _printer;

    public FizzBuzzIntegration(Printer printer)
    {
        _printer = printer;
    }

    public void FizzBuzz()
    {
        var range = RangeGenerator.GenerateRange();
        var results = range.Select(FizzBuzzConverter.Convert);
        results.ForEach(_printer.Print);
    }
}