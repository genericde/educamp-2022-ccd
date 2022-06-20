public static class LineFilter
{
    public static List<string> Filter(List<string> lines)
    {
        List<string> filteredLines = lines.Where(l => (!l.Contains("//")) && (!String.IsNullOrWhiteSpace(l))).ToList();
        return filteredLines;
    }
}