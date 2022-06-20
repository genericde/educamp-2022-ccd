class FizzBuzzConverter {

    public static void printFizzBuzz() {
        int n = 100;

        for (int i = 1; i <= n; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                isFizzBuzz();
            } else if (i % 3 == 0) {
                isFizz();
            } else if (i % 5 == 0) {
                isFuzz();
            } else {
                System.out.print(i);
            }

            System.out.print(", " );
        }

    }

    private static void isFizzBuzz() {
        System.out.print("FizzBuzz");
    }

    private static void isFizz() {
        System.out.print("Fizz");
    }

    private static void isFuzz() {
        System.out.print("Buzz");
    }

}
