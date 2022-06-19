import { RomanLiteralMapping } from "./roman-literal-mapping.interface";
import { RomanLiteral } from './roman-literal.type';

const errorMessageInvalidLetters = 'Error: Invalid Letters in Numeral!';

const romanLiteralsMap: RomanLiteralMapping[] = [
  { literal: 'I', value: 1 },
  { literal: 'V', value: 5 },
  { literal: 'X', value: 10 },
  { literal: 'L', value: 50 },
  { literal: 'C', value: 100 },
  { literal: 'D', value: 500 },
  { literal: 'M', value: 1000}
];

const validRomanLiterals = romanLiteralsMap.map(
  (romanLiteralMap: RomanLiteralMapping) => romanLiteralMap.literal
);

export const sumRomanNumeral = (romanNumeralToSum: string): number => {
  if (hasIllegalLetters(romanNumeralToSum)) {
    throw new Error(errorMessageInvalidLetters);
  }

  let sum = 0;

  for (let i = 0; i < romanNumeralToSum.length; i++) {
    const currentValue = determineNumberValueOfRomanLiteral(romanNumeralToSum[i]);
    const nextValue = determineNumberValueOfRomanLiteral(romanNumeralToSum[i + 1]);

    if (currentValue === nextValue || currentValue > nextValue) {
      sum += currentValue;
    } else {
      sum -= currentValue;
    }
  }

  return sum;
}

const determineNumberValueOfRomanLiteral = (romanLiteral: string): number => {
  const romanLiteralMap: RomanLiteralMapping | undefined = romanLiteralsMap.find(
    (map: RomanLiteralMapping) => map.literal === romanLiteral
  );

  return romanLiteralMap?.value ?? 0;
}

const hasIllegalLetters = (romanNumeral: string): boolean => {
  const romanNumeralLetters = romanNumeral.split('') as RomanLiteral[];

  return romanNumeralLetters.some(
    (value: RomanLiteral) => !validRomanLiterals.includes(value)
  );
}
