package fizzbuzz;

public class FizzBuzz {
	private final StringBuilder wordBuilder = new StringBuilder();
	
	public String convert(int number) {
		if (number <= 0) {
			throw new IllegalArgumentException("number must be strictly positive");
		}
		
		initWordBuilder();
		appendSpecialWords(number);
		if (wordBuilder.isEmpty()) {
			appendNumberWord(number);
		}
		return wordBuilder.toString();
	}

	private void initWordBuilder() {
		wordBuilder.setLength(0);
	}
	
	private void appendSpecialWords(int number) {
		for (var word : SpecialWord.values()) {
			if (word.match(number)) {
				wordBuilder.append(word.name());
			}
		}
	}

	private void appendNumberWord(int number) {
		wordBuilder.append(number);
	}
}
