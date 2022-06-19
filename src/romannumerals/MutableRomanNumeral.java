package romannumerals;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Optional;

final class MutableRomanNumeral {

	private Deque<RomanLiteral> literals = new LinkedList<>();
	
	public Optional<RomanLiteral> last() {
		if (literals.isEmpty()) {
			return Optional.empty();
		}
		return Optional.of(literals.getLast());
	}
	
	public void addLast(RomanLiteral literal) {
		literals.addLast(literal);
	}
	
	public void addPrevious(RomanLiteral literal) {
		if (literals.isEmpty()) {
			addLast(literal);
		}
		var last = literals.removeLast();
		addLast(literal);
		addLast(last);
	}
	
	public RomanNumeral toImmutable() {
		return new RomanNumeral(literals);
	}
}
