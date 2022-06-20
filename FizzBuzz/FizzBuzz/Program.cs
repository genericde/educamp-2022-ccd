using System;
using System.Collections.Generic;

namespace FizzBuzz
{
    public class Program
    {
        static void Main(string[] args)
        {
            try
            {
                RangeCreator rangeCreator = new RangeCreator();  
                List<int> range = new List<int>();
                List<String> convertedNumbers = new List<String>();

                range = rangeCreator.GenerateRange();
                FizzBuzzConverter converter = new FizzBuzzConverter();
                convertedNumbers = converter.Convert(range);   

                Printer printer = new Printer();
                printer.Print(convertedNumbers);   
                
                Console.ReadKey();
            }
            catch (Exception ex)
            {
                Console.WriteLine(ex.ToString());
            }
        }
    }
}
