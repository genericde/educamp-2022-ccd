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
            for (int i = 1; i <= 100; i++)
            {
                Console.WriteLine(replaceNumber(i));
            }
            Console.ReadKey();
        }

       

        public static string concatResults(string input1, string input2)
        {
            return input1 + input2;
        }

        public static string replaceNumber(int inputNumber)
        {
            string result = concatResults(ReplaceDivisbleByThree(inputNumber),ReplaceDivisbleByFive(inputNumber));
            return (result == String.Empty) ? inputNumber.ToString() : result;
        }

        public static string ReplaceDivisble(int inputNumber, int DivisibleBy)
        {
            return (inputNumber % DivisibleBy == 0) ? replaceTable[DivisibleBy] : String.Empty;
        }
        public static string ReplaceDivisbleByThree(int inputNumber)
        {
            return ReplaceDivisble(inputNumber, 3);
        }

        public static string ReplaceDivisbleByFive(int inputNumber)
        {
            return ReplaceDivisble(inputNumber, 5);
        }
    }
}
