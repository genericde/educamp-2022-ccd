namespace FizzBuzz
{
    public class FizzBuzzCreator
    {
        public void FizzBuzzListCreation()
        {
            var list = RangeCreator(100);

            foreach (var i in list)
                Printer(FizzBuzzConverter(i));
        }

        public IEnumerable<int> RangeCreator(int size)
        {
            return Enumerable.Range(1,size);
        }

        public string FizzBuzzConverter(int data)
        {
            if(data%3==0) 
                return data % 5 == 0 ? "FizzBuzz" : "Fizz";
            return data % 5 == 0 ? "Buzz" : data.ToString();
        }

        public void Printer(string data)
        {
            Console.WriteLine(data);
        }
    }
}
