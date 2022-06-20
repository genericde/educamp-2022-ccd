using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LocCount
{
    public static class FileReader
    {
        public static List<String> Read(string filename)
        {
           return System.IO.File.ReadAllLines(filename).ToList<String>();
        }
    }
}
