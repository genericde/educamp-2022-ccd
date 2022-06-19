namespace FizzBuzz;

public class RangeProvider
{
    public static IEnumerable<int> Provide() => Enumerable.Range(1, 100);
}