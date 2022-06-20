export class RangeCreator {

  public createRange(): number[] {
    const array: number[] = [];

    for (let i = 1; i <= 100; i++) {
      array.push(i);
    }

    return array;
  }

}
