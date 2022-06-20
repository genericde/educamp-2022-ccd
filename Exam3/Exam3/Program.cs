using System;

namespace Exam3
{
	class Program
	{
		static void Main(string[] args)
		{
			Console.WriteLine("Start App!");

			var fizzBuzzIntegration = new FizzBuzzIntegration();
			fizzBuzzIntegration.FizzBuzzIntegrationHandler();

			Console.WriteLine("End App!");

		}
	}
}
