using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LocCount
{
    public static class FilterLines
    {
        public static List<String> Filter(List<String> inputLines)
        {
            Func<string, bool> filterEmptyLines = line => line.Length > 0;
            Func<string, bool> filterSingleCommentLines = line => !line.TrimStart().StartsWith(@"//");

            var filteredLines = inputLines.Where(filterEmptyLines).Where(filterSingleCommentLines);
            return filteredLines.ToList<String>();
        }
    }
}
