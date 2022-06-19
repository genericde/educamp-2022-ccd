import { RomanNumeralValueObject } from "./roman-numeral-value-object.interface";

const errorMessageInvalidChars = 'Error: Invalid Characters in Numeral!';

const romanNumeralsMap: RomanNumeralValueObject[] = [
  { key: 'I', value: 1 },
  { key: 'V', value: 5 },
  { key: 'X', value: 10 },
  { key: 'L', value: 50 },
  { key: 'C', value: 100 },
  { key: 'D', value: 500 },
  { key: 'M', value: 1000}
];

const validRomanNumerals = romanNumeralsMap.map(
  (numeralValueObject: RomanNumeralValueObject) => numeralValueObject.key
);


export const sumRomanNumerals = (romanNumaralsToSum: string): number => {
  if (hasIllegalLetters(romanNumaralsToSum)) {
    throw new Error(errorMessageInvalidChars);
  }

  let sum = 0;

  for (let i = 0; i < romanNumaralsToSum.length; i++) {
    const currentValue = determineNumberValueOfRomanNumeral(romanNumaralsToSum[i]);
    const nextValue = determineNumberValueOfRomanNumeral(romanNumaralsToSum[i + 1]);

    if (currentValue === nextValue || currentValue > nextValue) {
      sum += currentValue;
    } else {
      sum -= currentValue;
    }
  }

  return sum;
}

const determineNumberValueOfRomanNumeral = (romanNumeral: string): number => {
  const numeralValueObject: RomanNumeralValueObject | undefined = romanNumeralsMap.find(
    (numeralValueObject: RomanNumeralValueObject) => numeralValueObject.key === romanNumeral
  );

  return numeralValueObject?.value ?? 0;
}

const hasIllegalLetters = (romanNumeral: string): boolean => {
  const romanNumeralChars = romanNumeral.split('');

  return romanNumeralChars.some(
    (value: string) => !validRomanNumerals.includes(value)
  );
}
