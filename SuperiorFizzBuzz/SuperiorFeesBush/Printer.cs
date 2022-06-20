public static class Printer
{
    public static void Print(List<object> values)
    {
        foreach(object value in values)
        {
            Console.WriteLine(value);
        }
    }
}