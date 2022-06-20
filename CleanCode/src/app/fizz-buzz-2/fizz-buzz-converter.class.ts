import { FizzBuzzNumberUnion } from '../fizz-buzz/fizz-buzz-numer-union.type';
import { BUZZ, FIZZ, FIZZ_BUZZ } from './fizz-buzz.const';

export class FizzBuzzConverter {
  static convertArrayToFizzBuzz(array: number[]): FizzBuzzNumberUnion[] {
    const convertedArray: FizzBuzzNumberUnion[] = [];

    for (let element of array) {
      convertedArray.push(
        this.getFizzBuzzValue(element)
      );
    }

    return convertedArray;
  }

  static getFizzBuzzValue = (i: number): FizzBuzzNumberUnion => {
    if (this.isFizz(i) && this.isBuzz(i)) {
      return FIZZ_BUZZ;
    }

    if (this.isFizz(i)) {
      return FIZZ;
    }

    if (this.isBuzz(i)) {
      return BUZZ;
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
