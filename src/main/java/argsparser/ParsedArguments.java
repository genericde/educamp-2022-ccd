package main.java.argsparser;

public class ParsedArguments {
    Boolean booleanParsed = false;
    String stringParsed;
    Integer intParsed;

    public ParsedArguments() {
    }

    public void setBooleanParsed(Boolean booleanParsed) {
        this.booleanParsed = booleanParsed;
    }

    public void setStringParsed(String stringParsed) {
        this.stringParsed = stringParsed;
    }

    public void setIntParsed(Integer intParsed) {
        this.intParsed = intParsed;
    }

    public Boolean isBooleanParsed() {
        return booleanParsed;
    }

    public String getStringParsed() {
        return stringParsed;
    }

    public Integer getIntParsed() {
        return intParsed;
    }
}
