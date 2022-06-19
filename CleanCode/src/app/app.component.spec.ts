import { sumRomanNumerals } from './roman-numerals.const';
/*

  ngOnInit(): void {
    console.log('TEST CASES');
    console.log('I', this.sumRomanNumerals('I'), 'should be 1', this.sumRomanNumerals('I') === 1);
    console.log('II', this.sumRomanNumerals('II'), 'should be 2', this.sumRomanNumerals('II') === 2);
    console.log('IV', this.sumRomanNumerals('IV'), 'should be 4', this.sumRomanNumerals('IV') === 4);
    console.log('V', this.sumRomanNumerals('V'), 'should be 5', this.sumRomanNumerals('V') === 5);
    console.log('IX', this.sumRomanNumerals('IX'), 'should be 9', this.sumRomanNumerals('IX') === 9);
    console.log('XLII', this.sumRomanNumerals('XLII'), 'should be 42', this.sumRomanNumerals('XLII') === 42);
    console.log('XCIX', this.sumRomanNumerals('XCIX'), 'should be 99', this.sumRomanNumerals('XCIX') === 99);
    console.log('MMXXII', this.sumRomanNumerals('MMXXII'), 'should be 2022', this.sumRomanNumerals('MMXXII') === 2022);

    try {
      console.log('MMXA', this.sumRomanNumerals('MMXA'), 'should throw error', this.sumRomanNumerals('MMXA'));
    } catch (e) {
      console.error(e)
    }
  }
*/

describe('Test Roman Numerals', () => {
  it('should sum I to 1', () => {
    const value = sumRomanNumerals('I');

    expect(value).toBe(1);
  });

  it('should sum II to 2', () => {
    const value = sumRomanNumerals('II');

    expect(value).toBe(2);
  });

  it('should sum IV to 4', () => {
    const value = sumRomanNumerals('IV');

    expect(value).toBe(4);
  });

  it('should sum V to 5', () => {
    const value = sumRomanNumerals('V');

    expect(value).toBe(5);
  });

  it('should sum IX to 9', () => {
    const value = sumRomanNumerals('IX');

    expect(value).toBe(9);
  });

  it('should sum XLII to 42', () => {
    const value = sumRomanNumerals('XLII');

    expect(value).toBe(42);
  });

  it('should sum XCIX to 99', () => {
    const value = sumRomanNumerals('XCIX');

    expect(value).toBe(99);
  });

  it('should sum MMXXII to 2022', () => {
    const value = sumRomanNumerals('MMXXII');

    expect(value).toBe(2022);
  });
});
