export class RangeCreator {

  static createRange(): number[] {
    const numbers: number[] = [];

    for (let i = 1; i <= 100; i++) {
      numbers.push(i);
    }

    return numbers;
  }

}
