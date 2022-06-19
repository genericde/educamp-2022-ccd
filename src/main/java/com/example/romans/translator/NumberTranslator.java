package com.example.romans.translator;

public class NumberTranslator {

    public Integer translateRomanNumeras(String romanNumber) {
        Integer result = 0;
        
        switch (romanNumber) {
            case "I":
                result = 1;
                break;
            case "V":
                result = 5;
                break;
            case "X":
                result = 10;
                break;
            case "L":
                result = 50;
                break;
            case "C":
                result = 100;
                break;
            case "D":
                result = 500;
                break;
            case "M":
                result = 1000;
                break;
        }
        return result;
    }
}