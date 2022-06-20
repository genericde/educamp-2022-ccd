public static class FizzBuzz
{
    public static void Start()
    {
        IEnumerable<int> range = RangeCounter.GenerateRange();

        List<object> results = new List<object>();

        foreach(int number in range)
        {
            string result = FizzBuzzConverter.Convert(number);

            if(result != null)
            {
                results.Add(result);
            }
            else
            {
                results.Add(number);
            }
        }

        Printer.Print(results);
    }
}