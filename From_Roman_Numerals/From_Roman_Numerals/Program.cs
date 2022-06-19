﻿using System;
using System.Collections.Generic;

namespace From_Roman_Numerals
{
    internal class Program
    {
        // Dictionary for all valid Numerals
        static Dictionary<char, int> numerals = new Dictionary<char, int>()
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

                Console.WriteLine("Accepted Numerals: ");
                foreach (KeyValuePair<char, int> numeral in numerals)
                {
                    Console.WriteLine(numeral.Key + " - " + numeral.Value);
                }
            
                do
                {
                    Console.WriteLine("Enter your Roman Numeral: ");
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

                // Iterate through input
                foreach (char singleNumeral in numeralInput)
                {
                    if (numerals.ContainsKey(singleNumeral))
                    {
                        // Check if this is the first numeral. If yes, just add it to result
                        if (lastSingleNumeral != 'z')
                        {
                            // Check if the current numeral is larger then the next one -> If yes, the last numeral has to be substracted twice
                            // example : "IV" should be 4
                            // as "I" was added to the result in the last cycle (+1), it is now clear that it was meant to be substracted from the current one,
                            // so it has to be substracted twice
                            if (numerals[lastSingleNumeral] < numerals[singleNumeral])
                            {
                                result = result - numerals[lastSingleNumeral] - numerals[lastSingleNumeral] + numerals[singleNumeral];
                            }
                            // Otherwise just add the result
                            else
                            {
                                result += numerals[singleNumeral];
                            }
                        }
                        else
                        {
                            result += numerals[singleNumeral];
                        }
                        // Set current numeral as "last numeral" to use in the next cycle
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
