using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace FizzBuzz
{
    public class Printer
    {
        public void Print (List<String> input)
        {
            foreach (string item in input)
            {
                Console.WriteLine(item);
            }
        }
    }
}
