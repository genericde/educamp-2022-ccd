import { FizzBuzzConverter } from '../fizz-buzz-2/fizz-buzz-converter.class';
import { BUZZ, FIZZ, FIZZ_BUZZ } from '../fizz-buzz-2/fizz-buzz.const';
import { FizzBuzzNumberUnion } from './fizz-buzz-numer-union.type';

describe('isFizz', () => {
  const testCases = [
    {i: 1, expectedValue: false},
    {i: 2, expectedValue: false},
    {i: 3, expectedValue: true},
    {i: 27, expectedValue: true},
    {i: 99, expectedValue: true},
    {i: 100, expectedValue: false}
  ];

  testCases.forEach((testCase) => testIsFizz(testCase.i, testCase.expectedValue));
});

describe('isBuzz', () => {
  const testCases = [
    {i: 1, expectedValue: false},
    {i: 2, expectedValue: false},
    {i: 5, expectedValue: true},
    {i: 25, expectedValue: true},
    {i: 99, expectedValue: false},
    {i: 100, expectedValue: true}
  ];

  testCases.forEach((testCase) => testIsBuzz(testCase.i, testCase.expectedValue));
});

describe('getFizzBuzzValue', () => {
  const testCases: {i: number, expectedValue: FizzBuzzNumberUnion}[] = [
    {i: 1, expectedValue: 1},
    {i: 3, expectedValue: FIZZ},
    {i: 5, expectedValue: BUZZ},
    {i: 15, expectedValue: FIZZ_BUZZ},
    {i: 45, expectedValue: FIZZ_BUZZ},
    {i: 99, expectedValue: FIZZ},
    {i: 100, expectedValue: BUZZ},
    {i: 101, expectedValue: 101}
  ];

  testCases.forEach((testCase) => testGetFizzBuzzValue(testCase.i, testCase.expectedValue));
});

function testIsFizz(i: number, expectedValue: boolean): void {
  it(`should map ${i} to ${expectedValue}`, () => {
    expect(FizzBuzzConverter.isFizz(i)).toBe(expectedValue);
  });
}

function testIsBuzz(i: number, expectedValue: boolean): void {
  it(`should map ${i} to ${expectedValue}`, () => {
    expect(FizzBuzzConverter.isBuzz(i)).toBe(expectedValue);
  });
}

function testGetFizzBuzzValue(i: number, expectedValue: FizzBuzzNumberUnion): void {
  it(`should map ${i} to ${expectedValue}`, () => {
    expect(FizzBuzzConverter.getFizzBuzzValue(i)).toEqual(expectedValue);
  });
}

