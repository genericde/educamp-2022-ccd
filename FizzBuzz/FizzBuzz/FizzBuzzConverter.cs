using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace FizzBuzz
{
    public class FizzBuzzConverter
    {

        public List<String> Convert(List<int> input)
        {
            try
            {
                List<String> result = new List<String>();
                foreach (int i in input)
                {

                    string convertString = String.Empty;
                    if (IsFizz(i))
                    {
                        convertString += "Fizz";
                    }
                    if (IsBuzz(i))
                    {
                        convertString += "Buzz";
                    }
                    if (convertString == String.Empty)
                    {
                        convertString = i.ToString();
                    }
                    result.Add(convertString);
                }

                return result;
            }
            catch (Exception ex)
            {
                throw new Exception(ex.Message);
            }

          
        }

        private bool IsFizz(int input)
        {
            return (input % 3 == 0);
        }
        private bool IsBuzz(int input)
        {
            return (input % 5 == 0);
        }
    }
}
