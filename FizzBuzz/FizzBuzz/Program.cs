﻿using System;
using System.Collections.Generic;

namespace FizzBuzz
{
    public class Program
    {
        static void Main(string[] args)
        {
            try
            {
                FizzBuzz.Start();
                Console.ReadKey();
            }
            catch (Exception ex)
            {
                Console.WriteLine(ex.ToString());
            }
        }
    }
}
