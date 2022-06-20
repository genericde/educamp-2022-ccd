using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LocCount
{
    public static class LocCount
    {
        public static void Start(string filename)
        {
            var lines = FileReader.Read(filename);
            var filteredLines = FilterLines.Filter(lines);
            var count = CountLines.Count(filteredLines);
            Display.Show(count);
        }
    }
}
