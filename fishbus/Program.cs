namespace Fishbus;

public class Program
{
    public static void Main()
    {
        Counter counter = GetFizzBuzzCounter();

        counter.ListNumbers(1, 100);
    }

    public static Counter GetFizzBuzzCounter()
    {
        Fizz fizz = new Fizz();
        Buzz buzz = new Buzz();
        FizzBuzz fizzBuzz = new FizzBuzz(fizz, buzz);
        return new Counter(fizzBuzz);
    }

}