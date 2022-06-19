package fizzbuzz

import fizzbuzz.printer.Printer

class FizzBuzzPrinter(
    private val fizzBuzzConverter: FizzBuzzConverter,
    private val printer: Printer
) {

    fun print() {
        for (i in 1..100) {
            printer.print(fizzBuzzConverter.convertNumber(i))
        }
    }
}