package romannumerals;

import java.util.Map;
import java.util.NavigableMap;
import java.util.Optional;
import java.util.TreeMap;

final class RomanLiteralBounds {

	private static final RomanLiteralBounds instance = new RomanLiteralBounds();
	
	public static RomanLiteralBounds instance() {
		return instance;
	}
	
	private final NavigableMap<Integer, RomanLiteral> lowerBounds = new TreeMap<>();
	
	private RomanLiteralBounds() {
		for (var literal : RomanLiteral.values()) {
			lowerBounds.put(literal.decimalBase(), literal);
		}
	}
	
	public Optional<RomanLiteral> findHighestLiteral(int decimalValue) {
		var entry = lowerBounds.floorEntry(decimalValue);
		return Optional.ofNullable(entry).map(Map.Entry::getValue);
	}
}
