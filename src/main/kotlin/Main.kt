import fizzbuzz.checker.BuzzChecker
import fizzbuzz.FizzBuzzConverter
import fizzbuzz.FizzBuzzIntegrator
import fizzbuzz.RangeGenerator
import fizzbuzz.checker.FizzChecker
import fizzbuzz.printer.ConsolePrinter

fun main() {
    val fizzBuzzConverter = FizzBuzzConverter(FizzChecker(), BuzzChecker())
    val fizzBuzzIntegrator = FizzBuzzIntegrator(RangeGenerator(), fizzBuzzConverter, ConsolePrinter())
    fizzBuzzIntegrator()
}