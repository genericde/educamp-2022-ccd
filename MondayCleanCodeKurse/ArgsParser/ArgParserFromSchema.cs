namespace ArgsParser
{
    public class ArgParserFromSchema
    {
        public readonly DictCreator Creator = new();
        public readonly Converter Converter = new();
        public object? GetArg(string schema, string arguments, string type)
        {
            var argDict = Creator.CreateArgDict(arguments);
            var schemaDict = Creator.CreateSchemaDict(schema);
            
            return schemaDict[type] switch
            {
                "?" => Converter.ConvertValueFromKey<bool>(argDict),
                "*" => Converter.ConvertValueFromKey<int>(argDict),
                "#" => Converter.ConvertValueFromKey<string>(argDict),
                _ => throw new ArgumentException("Arguments are not values")
            };
        }
    }
}
