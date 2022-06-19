using Microsoft.Extensions.DependencyInjection;
using System;

namespace Exam2
{
	public class Program
	{
		private static IValidator _validatorService;

		public static void Main(string[] args)
		{
			var serviceProvider = new ServiceCollection()
						.AddSingleton<IValidator, Validator>()
						.BuildServiceProvider();

			_validatorService = serviceProvider.GetService<IValidator>();

			Console.WriteLine("Start Application at: " + DateTime.UtcNow);

			HandleFizzBuzz();

			Console.WriteLine("End Application at: " + DateTime.UtcNow);

		}

		private static void HandleFizzBuzz()
		{
			for (int i = 1; i <= 100; i++)
			{
				var validationResult = _validatorService.ValidateCount(i);

				if (validationResult.IsFizz && validationResult.IsBuzz)
				{
					LogCounter("FizzBuzz");
				}
				else if (validationResult.IsFizz)
				{
					LogCounter("Fizz");
				}
				else if (validationResult.IsBuzz)
				{
					LogCounter("Buzz");
				}
				else
				{
					LogCounter(i.ToString());
				}
			}
		}

		private static void LogCounter(string counter)
		{
			Console.WriteLine(counter);
		}

	}
}
