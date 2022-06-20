using System.IO;

namespace FizzBuzz;

public class Printer
{
    private readonly TextWriter _output;

    public Printer(TextWriter output)
    {
        _output = output;
    }

    public void Print(string result)
    {
        _output.WriteLine(result);
    }
}