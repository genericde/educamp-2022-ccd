﻿using System;
using System.Linq;

namespace Exam1
{
	public class Program
	{
		public static void Main(string[] args)
		{
			var romanNumeral = "VI";

			var calculatedValue = TranslateRomanNumerals(romanNumeral);

			Console.WriteLine("Roman Literal: " + romanNumeral + " translated to:" + calculatedValue);

		}


		private static int TranslateRomanNumerals(string romanNumeral)
		{
			try
			{
				var romanChars = romanNumeral.ToCharArray();
				var list = RomanNumeralDefinition.GetValues();
				var decimalValue = 0;

				foreach (var romanChar in romanChars)
				{
					var item = list.First(x => x.Key == romanChar);
					decimalValue += item.Value;
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
