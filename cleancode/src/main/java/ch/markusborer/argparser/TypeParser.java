package ch.markusborer.argparser;

public interface TypeParser<T> {
    T parse(String value);
}
