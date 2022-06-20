namespace LocCount;

public static class LocCounter
{
    public static int CountLinesOfCode(IEnumerable<string> linesOfCode)
    {
        return linesOfCode
            .Select(s => s.Trim())
            .OmitSingleLineComments()
            .OmitEmptyLines()
            .Count();
    }

    private static IEnumerable<string> OmitEmptyLines(this IEnumerable<string> linesOfCode)
    {
        return linesOfCode.Where(line => string.IsNullOrWhiteSpace(line) is false);
    }

    private static IEnumerable<string> OmitSingleLineComments(this IEnumerable<string> linesOfCode)
    {
        return linesOfCode.Where(line => line.StartsWith("//") is false);
    }

}