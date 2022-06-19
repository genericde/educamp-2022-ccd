package fizzbuzz;

enum SpecialWord {

	FIZZ(3),
	BUZZ(5);
	
	private int divisor;
	
	SpecialWord(int divisor) {
		this.divisor = divisor;
	}
	
	public boolean match(int number) {
		var roundedNumber = (number / divisor) * divisor;
		return roundedNumber == number;
	}
}
