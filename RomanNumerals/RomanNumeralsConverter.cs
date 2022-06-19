namespace RomanNumerals;

public class RomanNumeralsConverter
{
    private readonly IDictionary<char, int> _romanNumsAndValues = new Dictionary<char, int>
    {
        ['I'] = 1,
        ['V'] = 5,
        ['X'] = 10,
        ['L'] = 50,
        ['C'] = 100,
        ['D'] = 500,
        ['M'] = 1000
    };

    public int RomanNumberToDecimal(string romanNumber)
    {
        List<char> romanNumerals = romanNumber.ToCharArray().ToList();

        if (!ValidateRomanNumber(romanNumerals))
        {
            throw new InvalidOperationException("Invalid roman numeral");
        }

        return ConvertRomanNumerals(romanNumerals);
    }

    private bool ValidateRomanNumber(List<char> romanNumerals)
    {
        foreach (var romanNumeral in romanNumerals)
        {
            bool isValid = _romanNumsAndValues.ContainsKey(romanNumeral);

            if (!isValid) return false;
        }

        return true;
    }

    private int ConvertRomanNumerals(List<char> romanNumerals)
    {
        int value = 0;
        List<int> valueMoves = new List<int>();

        for (int i = 0; i < romanNumerals.Count; i++)
        {
            int romanNumValue = _romanNumsAndValues[romanNumerals[i]];

            if (i == 0)
            {
                valueMoves.Add(romanNumValue);
                value = romanNumValue;
                continue;
            }

            //if new number is higher than the one before subract it

            Console.WriteLine(valueMoves[i - 1] < romanNumValue);

            if (valueMoves[i - 1] < romanNumValue)
            {
                if (valueMoves.Count > 1 && valueMoves[i - 2].Equals(1) && valueMoves[i - 1].Equals(1))
                {
                    value = romanNumValue - (valueMoves[i - 1] + valueMoves[i - 2]);
                }
                else
                {
                    Console.WriteLine(value + " " + romanNumValue);
                    value = value - romanNumValue;
                }
            }
            else
            {
                //Console.WriteLine(romanNumValue);

                if(value < 0)
                {
                    value -= romanNumValue;
                }
                else
                {
                    value += romanNumValue;
                }

            }

            valueMoves.Add(romanNumValue);
        }

        return Math.Abs(value);
    }
}