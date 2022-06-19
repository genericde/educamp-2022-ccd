using System;
using System.Collections.Generic;

namespace FizzBuzz
{
    public class Program
    {
        static Dictionary<int, string> replaceTable = new Dictionary<int, string>()
        {
            {3, "Fizz" },
            {5, "Buzz" }
        };

        static void Main(string[] args)
        {
            try
            {
                for (int i = 1; i <= 100; i++)
                {
                    Console.WriteLine(replaceNumber(i));
                }
                Console.ReadKey();
            }
            catch (Exception ex)
            {
                Console.WriteLine(ex.ToString());
            }
        }


        public static string concatResults(string input1, string input2)
        {
            try
            {
                return input1 + input2;
            }
            catch (Exception ex)
            {
                throw new Exception(ex.Message);
            }
        }

        public static string replaceNumber(int inputNumber)
        {
            try
            {
                string result = concatResults(ReplaceDivisble(inputNumber, 3), ReplaceDivisble(inputNumber, 5));
                return createResult(inputNumber, result);
            }
            catch (Exception ex)
            {
                throw new Exception(ex.Message);
            }
        }

        public static string createResult(int inputNumber, string result)
        {
            try { 
                return (result == String.Empty) ? inputNumber.ToString() : result;
            }
            catch (Exception ex)
            {
                throw new Exception(ex.Message);
            }
        }

        public static string ReplaceDivisble(int inputNumber, int DivisibleBy)
        {
            try
            {
                return (inputNumber % DivisibleBy == 0) ? replaceTable[DivisibleBy] : String.Empty;
            }
            catch (Exception ex) 
            {
                throw new Exception(ex.Message);
            }
        }
      
    }
}
