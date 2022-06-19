package romannumerals;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public final class RomanNumeral {

	private final Collection<RomanLiteral> literals;

	RomanNumeral(Collection<RomanLiteral> literals) {
		this.literals = new ArrayList<>(literals);
	}
	
	public String toString() {
		return literals.stream().map(RomanLiteral::toString).collect(Collectors.joining(""));
	}
}
