package loccount;

class EmptyLineFilter extends AbstractLineFilter {

	@Override
	boolean isCode(String line) {
		return !line.trim().isEmpty();
	}
}
