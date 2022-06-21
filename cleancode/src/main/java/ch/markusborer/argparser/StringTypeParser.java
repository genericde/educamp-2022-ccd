package ch.markusborer.argparser;

public class StringTypeParser implements TypeParser<String> {
    @Override
    public String parse(String value) {
        return value;
    }
}
