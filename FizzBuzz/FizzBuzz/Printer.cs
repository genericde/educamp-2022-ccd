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
            try
            {
                foreach (string item in input)
                {
                    Console.WriteLine(item);
                }
            }
            catch (Exception ex)
            {
                throw new Exception(ex.Message);
            }
        }
    }
}
