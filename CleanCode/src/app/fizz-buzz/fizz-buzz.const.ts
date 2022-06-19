import { FizzBuzzNumberUnion } from "./fizz-buzz-numer-union.type";

export const createFizzBuzzArrayFrom1ToN = (n: number): FizzBuzzNumberUnion[] => {
  const array: FizzBuzzNumberUnion[] = [];

  for (let i = 1; i <= n; i++) {
    array.push(getFizzBuzzValue(i));
  }

  return array;
}

export const getFizzBuzzValue = (i: number): FizzBuzzNumberUnion => {
  if (isFizz(i) && isBuzz(i)) {
    return 'FizzBuzz';
  }

  if (isFizz(i)) {
    return 'Fizz';
  }

  if (isBuzz(i)) {
    return 'Buzz';
  }

  return i;
}

export const isFizz = (i: number): boolean => {
  return i % 3 === 0;
}

export const isBuzz = (i: number): boolean => {
  return i % 5 === 0;
}
