import { FizzBuzzNumberUnion } from './fizz-buzz-numer-union.type';
import { getFizzBuzzValue, isBuzz, isFizz } from './fizz-buzz.const';

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
    {i: 3, expectedValue: 'Fizz'},
    {i: 5, expectedValue: 'Buzz'},
    {i: 15, expectedValue: 'FizzBuzz'},
    {i: 45, expectedValue: 'FizzBuzz'},
    {i: 99, expectedValue: 'Fizz'},
    {i: 100, expectedValue: 'Buzz'},
    {i: 101, expectedValue: 101}
  ];

  testCases.forEach((testCase) => testGetFizzBuzzValue(testCase.i, testCase.expectedValue));
});

function testIsFizz(i: number, expectedValue: boolean): void {
  it(`should map ${i} to ${expectedValue}`, () => {
    expect(isFizz(i)).toBe(expectedValue);
  });
}

function testIsBuzz(i: number, expectedValue: boolean): void {
  it(`should map ${i} to ${expectedValue}`, () => {
    expect(isBuzz(i)).toBe(expectedValue);
  });
}

function testGetFizzBuzzValue(i: number, expectedValue: FizzBuzzNumberUnion): void {
  it(`should map ${i} to ${expectedValue}`, () => {
    expect(getFizzBuzzValue(i)).toEqual(expectedValue);
  });
}

