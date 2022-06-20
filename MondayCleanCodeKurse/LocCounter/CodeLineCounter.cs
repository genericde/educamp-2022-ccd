namespace LocCounter
{
    public class CodeLineCounter
    {
        public int NumberOfCodeLines(string fileName)
        {
            var text = TextReader.TextLines(fileName);
            return text.Count(l => CodeFilter.IsCodeLine(l));
        }
    }
}
