import { FizzBuzzConverter } from './fizz-buzz-converter.class';
import { Printer } from './printer.class';
import { RangeCreator } from './range-creator.class';

export class FizzBuzz {

  static doFizzBuzz(): void {
    const numbers = RangeCreator.createRange();
    const result = FizzBuzzConverter.convertNumbersToFizzBuzz(numbers);
    Printer.printList(result);
  }

}
