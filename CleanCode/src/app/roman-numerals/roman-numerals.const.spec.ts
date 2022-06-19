import { sumRomanNumeral } from './roman-numerals.const';

xdescribe('sumRomanNumeral', () => {
  const numeralTestCases: {numeral: string, expectedValue: number}[] = [
    {numeral: 'I', expectedValue: 1},
    {numeral: 'II', expectedValue: 2},
    {numeral: 'IV', expectedValue: 4},
    {numeral: 'V', expectedValue: 5},
    {numeral: 'IX', expectedValue: 9},
    {numeral: 'XLII', expectedValue: 42},
    {numeral: 'XCIX', expectedValue: 99},
    {numeral: 'MMXXII', expectedValue: 2022},
  ];

  numeralTestCases.forEach((testCase) => {
    testRomanNumeral(testCase.numeral, testCase.expectedValue)
  });
});

function testRomanNumeral(numeral: string, expectedValue: number): void {
  it(`should sum ${numeral} to ${expectedValue}`, () => {
    const value = sumRomanNumeral(numeral);

    expect(value).toBe(expectedValue);
  });
}
