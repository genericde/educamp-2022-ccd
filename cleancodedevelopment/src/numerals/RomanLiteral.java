package numerals;

enum RomanLiteral {
	
	ONE('I', 1),
	FIVE('V', 5),
	TEN('X', 10),
	FIFTY('L', 50),
	HUNDRED('C', 100),
	FIVEHUNDRED('D', 500),
	THOUSAND('M', 1);
	
	char romanValue;
	int decValue;

	RomanLiteral(char roman, int decimal) {
		this.romanValue = roman;
		this.decValue = decimal;
	}
	
}
