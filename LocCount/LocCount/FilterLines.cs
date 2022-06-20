using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LocCount
{
    public static class FilterLines
    {
        public static List<String> filterLines(List<String> inputLines)
        {
            var filteredByEmptyLines = inputLines.Where(line => line.Length > 0);
            var filteredBySingleCommentLine = filteredByEmptyLines.Where(line => !(line.TrimStart().StartsWith(@"//"));
            return filteredBySingleCommentLine.ToList<String>();
        }
    }
}
