namespace LocCounter
{
    internal static class TextReader
    {
        internal static IEnumerable<string> TextLines(string pathFile)
        {
            if (string.IsNullOrEmpty(pathFile))
                throw new ArgumentNullException(nameof(pathFile));

            var text = File.ReadAllLines(pathFile);

            return text;
        }

    }
}