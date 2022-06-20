public static class LineParser
{
    public static List<string> Parse(StreamReader sr)
    {
        string result = sr.ReadToEnd();
        List<string> lines = result.Split("\n").ToList();
        return lines;
    }
}