package com.example.demo;

import com.example.demo.translator.NumberTranslator;

import java.util.List;

public class NumberCalculator {

    public Integer calculateArray(List<String> romanNumber) {
        NumberTranslator translator = new NumberTranslator();
        Integer sum =0;
        for(int i=0; i<romanNumber.size(); i++) {
            Integer firstValue = translator.translateRomanNumeras(romanNumber.get(i));
            Integer secondValue = null;
            if (i + 1 != romanNumber.size()) {
                secondValue = translator.translateRomanNumeras(romanNumber.get(i + 1));
            }

            if (secondValue!= null &&  firstValue >= secondValue) {
                sum += firstValue;
            }
            else if (secondValue == null){
                sum += firstValue;
            }
            else
            sum -= firstValue;

        }
        return sum;
    }

}