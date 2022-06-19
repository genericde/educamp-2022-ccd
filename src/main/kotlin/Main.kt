import fizzbuzz.checker.BuzzChecker
import fizzbuzz.FizzBuzzConverter
import fizzbuzz.FizzBuzzPrinter
import fizzbuzz.checker.FizzChecker
import fizzbuzz.printer.ConsolePrinter

fun main() {

    val fizzBuzzConverter = FizzBuzzConverter(FizzChecker(), BuzzChecker())
    val fizzBuzzPrinter = FizzBuzzPrinter(fizzBuzzConverter, ConsolePrinter())
    fizzBuzzPrinter.print()
}