using System;

namespace LocCount
{
    internal class Program
    {

        private static readonly string Filepath = @"C:\Users\Stephan.Rosin\source\repos\educamp-2022-ccd\From_Roman_Numerals\From_Roman_Numerals\Program.cs";
        static void Main(string[] args)
        {
            LocCount.Start(Filepath);
            Console.ReadKey();
        }
    }
}
