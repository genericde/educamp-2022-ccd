package fizzbuzz

import printer.Printer


class FizzBuzzIntegrator(
    private val rangeGenerator: RangeGenerator,
    private val fizzBuzzConverter: FizzBuzzConverter,
    private val printer: Printer
) {

    operator fun invoke() {
        val (start, end) = rangeGenerator.generateRange()
        for (i in start..end) {
            printer.print(fizzBuzzConverter.convertNumber(i))
        }
    }
}