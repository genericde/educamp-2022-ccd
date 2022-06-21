package ch.markusborer.argparser;

public class BooleanTypeParser implements TypeParser<Boolean> {
    @Override
    public Boolean parse(String value) {
        if (value != "") {
            throw new IllegalArgumentException("Value " + value + " is not allowed for boolean-parameter");
        }
        return true;
    }
}
