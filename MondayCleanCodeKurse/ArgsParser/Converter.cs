using System.ComponentModel;

namespace ArgsParser
{
    public class Converter
    {
        public T? ConvertValueFromKey<T>(Dictionary<string,string> args)
        {
            var valueToGet = args[typeof(T).ToString()];
            try
            {
                var convertor = TypeDescriptor.GetConverter(typeof(T));
                return (T)(convertor.ConvertFromInvariantString(valueToGet))!;
            }
            catch (Exception e)
            {;
                throw new ArgumentException($"Arg {valueToGet} is not a {typeof(T)}");
            }
        }
    }
}
