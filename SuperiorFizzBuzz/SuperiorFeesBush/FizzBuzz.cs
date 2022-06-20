public static class FizzBuzz
{
    public static void Start()
    {
        IEnumerable<int> range = RangeCounter.GenerateRange();

        foreach(int number in range)
        {
            string result = FizzBuzzConverter.Convert(number);

            if(result != null)
            {
                Printer.Print(result);
            }
            else
            {
                Printer.Print(number);
            }
        }
    }
}