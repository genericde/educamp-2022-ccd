namespace LocCounter
{
    internal static class CodeFilter
    {
        internal static bool IsCodeLine(string line)
        {
            var isComment = line.Trim().StartsWith("//");

            return !isComment && !string.IsNullOrEmpty(line);
        }
    }
}
