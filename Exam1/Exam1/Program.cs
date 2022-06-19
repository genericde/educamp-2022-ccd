using System;
using System.Linq;

namespace Exam1
{
	public class Program
	{
		public static void Main(string[] args)
		{
			var romanNumeral = "IIV";

			var calculatedValue = TranslateRomanNumerals(romanNumeral);

			Console.WriteLine("Roman Numeral: " + romanNumeral + " translated to:" + calculatedValue);

		}


		private static int TranslateRomanNumerals(string romanNumeral)
		{
			try
			{
				var romanChars = romanNumeral.ToCharArray();
				var romanNumeralDefinition = RomanNumeralDefinition.GetValues();
				var decimalValue = 0;
				var previousIndex = 0;

				for (int i = 0; i < romanChars.Length; i++)
				{
					var item = romanNumeralDefinition.First(x => x.Key == romanChars[i]);
					var currentIndex = romanNumeralDefinition.IndexOf(item);

					if (i != 0)
					{
						previousIndex = romanNumeralDefinition.FindIndex(x => x.Key == romanChars[i - 1]);

						if (currentIndex > previousIndex)
						{
							decimalValue = item.Value - decimalValue;
						}
						else
						{
							decimalValue += item.Value;
						}

					}
					else
					{
						decimalValue += item.Value;
					}

				}

				return decimalValue;
			}
			catch (Exception ex)
			{
				Console.Error.WriteLine("Failed to translate Roman Numerals: " + ex);
				return 0;
			}
		}

	}
}
