// Dictionary for all valid Numerals
Dictionary<char, int> numerals = new Dictionary<char, int>();
numerals.Add('I', 1);
numerals.Add('V', 5);
numerals.Add('X', 10);
numerals.Add('L', 50);
numerals.Add('C', 100);
numerals.Add('D', 500);
numerals.Add('M', 1000);


string numeralInput = ""; // Input of numeral to evaluate
int result = 0; // Result to be calculated

Console.WriteLine("Accepted Numerals: ");
foreach (KeyValuePair<char, int> numeral in numerals)
{
    Console.WriteLine(numeral.Key + " - " + numeral.Value);
}

do
{
    Console.WriteLine("Enter your Roman Numeral: ");
    numeralInput = Console.ReadLine();

    char lastSingleNumeral = 'z';
    //Iterate through input
    foreach (char singleNumeral in numeralInput)
    {
        if (!numerals.ContainsKey(singleNumeral))
        {
            Console.WriteLine("Character " + singleNumeral + " not accepted");
            return;
        }
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
    
    Console.WriteLine("Result: " + result);
    result = 0;
} while (numeralInput != String.Empty);

