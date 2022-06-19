package fizz_buzz;

public class FizzBuzz {
    public static void printFizzBuzz(int range) {
        for (int number = 1; number <= range; number++) {
            System.out.println(buildPrintString(number));
        }
    }

    private static String buildPrintString(int number) {
        var printString = "";

        if (isFizz(number)) {
            printString += "FIZZ";
        }

        if (isBuzz(number)) {
            printString += "BUZZ";
        }

        if (isStringEmpty(printString.length())) {
            printString += number;
        }

        return printString;
    }

    private static boolean isStringEmpty(int lineToPrint) {
        return lineToPrint == 0;
    }

    private static boolean isFizz(int number) {
        return number % 3 == 0;
    }

    private static boolean isBuzz(int number) {
        return number % 5 == 0;
    }
}
