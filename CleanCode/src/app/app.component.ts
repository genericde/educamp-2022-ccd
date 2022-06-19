import { Component, OnInit } from '@angular/core';

interface RomanNumeralValueObject {
  key: string;
  value: number
};

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent implements OnInit {

  private readonly romanNumeralsMap: RomanNumeralValueObject[] = [
    { key: 'I', value: 1 },
    { key: 'V', value: 5 },
    { key: 'X', value: 10 },
    { key: 'L', value: 50 },
    { key: 'C', value: 100 },
    { key: 'D', value: 500 },
    { key: 'M', value: 1000}
  ];

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
  }

  private sumRomanNumerals(romanNumarals: string): number {
    let totalValue = 0;

    for (let i = 0; i < romanNumarals.length; i++) {
      const currentValue = this.getNumberValueOfRomanNumeral(romanNumarals[i]);
      const nextValue = this.getNumberValueOfRomanNumeral(romanNumarals[i + 1]);

      if (currentValue === nextValue || currentValue > nextValue) {
        totalValue += currentValue;
      } else {
        totalValue -= currentValue;
      }
    }

    return totalValue;
  }

  private getNumberValueOfRomanNumeral(romanNumeral: string): number {
    const numeralValueObject: RomanNumeralValueObject | undefined = this.romanNumeralsMap.find(
      (numeralValueObject) => numeralValueObject.key === romanNumeral
    );

    return numeralValueObject?.value ?? 0;
  }

}
