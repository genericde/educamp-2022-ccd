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
            try
            {
                var rangeCreator = new RangeCreator();
                var converter = new FizzBuzzConverter();
                var printer = new Printer();

                var range = rangeCreator.GenerateRange();
                var convertedNumbers = converter.Convert(range);
                printer.Print(convertedNumbers);
            }
            catch (Exception ex)
            {
                throw new Exception(ex.Message);
            }
           
        }
    }
}
