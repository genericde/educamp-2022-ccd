namespace ArgsParser
{
    public class DictCreator

    {
        public Dictionary<string, string> CreateArgDict(string arguments)
        {
            var argsInput = arguments.Split("-");
            var dict = argsInput.ToDictionary(arg => arg.First().ToString(), arg => arg.Remove(0));

            return dict;
        }   
        
        public Dictionary<string, string> CreateSchemaDict(string schema)
        {
            var argsInput = schema.Split(",");
            var dict = argsInput.ToDictionary(arg => arg.First().ToString(), arg => arg.Remove(0));

            return dict;
        }
    }

}