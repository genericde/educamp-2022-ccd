package ch.markusborer.argparser;

public class IntegerTypeParser implements TypeParser<Integer> {
    @Override
    public Integer parse(String value) {
        return Integer.parseInt(value);
    }
}
