import { FizzBuzzConverter } from './fizz-buzz-converter.class';
import { Printer } from './printer.class';
import { RangeCreator } from './range-creator.class';

export class FizzBuzz {

  doFizzBuzz(): void {
    const numberArray = new RangeCreator().createRange();
    const convertedArray = new FizzBuzzConverter().convertArrayToFizzBuzz(numberArray);
    new Printer().printArray(convertedArray);
  }

}
