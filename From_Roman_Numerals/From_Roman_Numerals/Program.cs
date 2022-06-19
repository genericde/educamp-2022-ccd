using System;
using System.Collections.Generic;

namespace From_Roman_Numerals
{
    internal class Program
    {
        // Dictionary for all valid Numerals
        static Dictionary<char, int> validNumerals = new Dictionary<char, int>()
        {
            { 'I', 1 },
            { 'V', 5 },
            { 'X', 10 },
            { 'L', 50 },
            { 'C', 100 },
            { 'D', 500 },
            { 'M', 1000 }
        };

        static void Main(string[] args)
        {
            try
            {
                string numeralInput; // Input of numeral to evaluate

                Console.WriteLine("Accepted numerals: ");
                foreach (KeyValuePair<char, int> numeral in validNumerals)
                {
                    Console.WriteLine(numeral.Key + " - " + numeral.Value);
                }
            
                do
                {
                    Console.WriteLine("Enter your Roman numeral: ");
                    numeralInput = Console.ReadLine();
                    Console.WriteLine("Result: " + TranslateNumerals(numeralInput));
                } while (numeralInput != String.Empty);
            }
            catch (Exception ex)
            {
                Console.WriteLine(ex.Message);
            }
        }
        static int TranslateNumerals(string numeralInput)
        {
            try
            {
                int result = 0;
                char lastSingleNumeral = 'z';

                foreach (char singleNumeral in numeralInput)
                {
                    if (validNumerals.ContainsKey(singleNumeral))
                    {
                        if (lastSingleNumeral != 'z')
                        {
                            // Check if the current numeral is larger then the next one -> If yes, the last numeral has to be substracted twice
                            // example : "IV" should be 4
                            // as "I" was added to the result in the last cycle (+1), it is now clear that it was meant to be substracted from the current one,
                            // so it has to be substracted twice
                            if (validNumerals[lastSingleNumeral] < validNumerals[singleNumeral])
                            {
                                result = result - (2*validNumerals[lastSingleNumeral]) + validNumerals[singleNumeral];
                            }
                            else
                            {
                                result += validNumerals[singleNumeral];
                            }
                        }
                        else
                        {
                            result += validNumerals[singleNumeral];
                        }
                        lastSingleNumeral = singleNumeral;
                    }
                }
                return result;
            }
            catch (Exception ex)
            {
                throw new Exception(ex.Message);
            }
        }
    }
}
