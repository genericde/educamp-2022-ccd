package roman_numerals;

public enum RomanLiteralEnum {
    I(1, 2),
    V(5,1),
    X(10,1),
    L(50,1),
    C(100,1),
    D(500,1),
    M(1000,1);

    public final int decimalValue;
    public final int allowedReoccurrences;

    RomanLiteralEnum(int decimalValue, int allowedReoccurrences) {
        this.decimalValue = decimalValue;
        this.allowedReoccurrences = allowedReoccurrences;
    }

    public static RomanLiteralEnum lookup(byte literal) {
        try {
            return RomanLiteralEnum.valueOf(String.valueOf(literal));
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("The given literal: '" + literal + "' is invalid or not supported." + "The following are accepted: I,V,X,L,C,D,M");
        }
    }


}
