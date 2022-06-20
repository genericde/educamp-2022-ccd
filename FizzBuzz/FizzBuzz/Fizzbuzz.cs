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

            RangeCreator rangeCreator = new RangeCreator();
            FizzBuzzConverter converter = new FizzBuzzConverter();
            Printer printer = new Printer();

            var range = rangeCreator.GenerateRange();
            var convertedNumbers = converter.Convert(range);
            printer.Print(convertedNumbers);
        }
    }
}
