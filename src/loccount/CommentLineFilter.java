package loccount;

class CommentLineFilter extends AbstractLineFilter {

	@Override
	boolean isCode(String line) {
		return !line.trim().startsWith("//");
	}
}
