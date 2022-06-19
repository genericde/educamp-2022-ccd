import ch.adesso.educamp.fizzbuzz.FizzBuzzConverter
import ch.adesso.educamp.fizzbuzz.RangeGenerator
import ch.adesso.educamp.fizzbuzz.Printer

fun main(args: Array<String>) {
    // number divisible by 3 should be displayed as Fizz
    // number divisible by 5 should be displayed as Buzz
    // number divisible by 3 and 5 should be displayed as FizzBuzz

    val (startRange, endRange) = RangeGenerator.generate()
    for (entry in startRange..endRange) {
        val result = FizzBuzzConverter.isFizzBuzz(entry)
        Printer.print(result)
    }
}
