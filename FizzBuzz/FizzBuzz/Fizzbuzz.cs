using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace FizzBuzz
{
    public static class FizzBuzz
    {
        public static void Start()
        {
            List<int> range = new List<int>();
            List<String> convertedNumbers = new List<String>();

            RangeCreator rangeCreator = new RangeCreator();
            FizzBuzzConverter converter = new FizzBuzzConverter();
            Printer printer = new Printer();

            range = rangeCreator.GenerateRange();
            convertedNumbers = converter.Convert(range);
            printer.Print(convertedNumbers);
        }
    }
}
