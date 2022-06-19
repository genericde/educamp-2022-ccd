using System;

namespace FizzBuzz
{
    public class Program
    {
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
            if (result == String.Empty)
                return inputNumber.ToString();
            else
                return result;
        }

        public static string ReplaceDivisbleByThree(int inputNumber)
        {
            if (inputNumber % 3 == 0)
                return "Fizz";
            else
                return String.Empty;
        }

        public static string ReplaceDivisbleByFive(int inputNumber)
        {
            if (inputNumber % 5 == 0)
                return "Buzz";
            else
                return String.Empty;
        }
    }
}
