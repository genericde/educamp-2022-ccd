using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace FizzBuzz
{
    public  class RangeCreator
    { 
        public List<int> GenerateRange() {
            try
            {
                List<int> result = new List<int>();
                for (int i = 1; i <= 100; i++)
                {
                    result.Add(i);
                }
                return result;
            }
            catch (Exception ex)
            {
                throw new Exception(ex.Message);
            }
        }
    }
}
