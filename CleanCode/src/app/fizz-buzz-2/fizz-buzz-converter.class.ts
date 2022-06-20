import { FizzBuzzNumberUnion } from '../fizz-buzz/fizz-buzz-numer-union.type';

export class FizzBuzzConverter {
  static convertArrayToFizzBuzz(array: number[]): FizzBuzzNumberUnion[] {
    const convertedArray: FizzBuzzNumberUnion[] = [];

    for (let entry of array) {
      convertedArray.push(
        this.getFizzBuzzValue(entry)
      );
    }

    return convertedArray;
  }

  static getFizzBuzzValue = (i: number): FizzBuzzNumberUnion => {
    if (this.isFizz(i) && this.isBuzz(i)) {
      return 'FizzBuzz';
    }

    if (this.isFizz(i)) {
      return 'Fizz';
    }

    if (this.isBuzz(i)) {
      return 'Buzz';
    }

    return i;
  }

  static isFizz = (i: number): boolean => {
    return i % 3 === 0;
  }

  static isBuzz = (i: number): boolean => {
    return i % 5 === 0;
  }
}
