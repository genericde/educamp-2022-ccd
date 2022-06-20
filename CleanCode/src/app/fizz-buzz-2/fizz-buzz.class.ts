import { FizzBuzzConverter } from './fizz-buzz-converter.class';
import { Printer } from './printer.class';
import { RangeCreator } from './range-creator.class';

export class FizzBuzz {

  static doFizzBuzz(): void {
    const numberArray = RangeCreator.createRange();
    const convertedArray = FizzBuzzConverter.convertArrayToFizzBuzz(numberArray);
    Printer.printArray(convertedArray);
  }

}
