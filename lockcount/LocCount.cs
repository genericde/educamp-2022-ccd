public class LocCount
{
    private readonly IPrinter _printer;

    public LocCount(IPrinter printer)
    {
        _printer = printer;
    }

    public void CountLinesOfFile(string fileName)
    {
        var content = FileReader.Read(fileName);
        var lines = LineParser.Parse(content);
        var filteredLines = LineFilter.Filter(lines);
        var lineCount = LineCounter.Count(filteredLines);
        _printer.Print(lineCount);
    }
}