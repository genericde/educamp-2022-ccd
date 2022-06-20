import fizzbuzz.checker.BuzzChecker
import fizzbuzz.FizzBuzzConverter
import fizzbuzz.FizzBuzzIntegrator
import fizzbuzz.RangeGenerator
import fizzbuzz.checker.FizzChecker
import loccount.LocCount
import printer.ConsolePrinter

fun main() {

    val printer = ConsolePrinter()

    val fizzBuzzConverter = FizzBuzzConverter(FizzChecker(), BuzzChecker())
    val fizzBuzzIntegrator = FizzBuzzIntegrator(RangeGenerator(), fizzBuzzConverter, printer)
    fizzBuzzIntegrator()

    val fileName = "./src/main/kotlin/loccount/TestFile.kt"
    val locCount = LocCount(printer)
    locCount(fileName)

}