public static class FileReader
{
    public static StreamReader Read(string fileName)
    {
        return new StreamReader(fileName);
    }
}