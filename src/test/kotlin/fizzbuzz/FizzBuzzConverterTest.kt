package fizzbuzz

import fizzbuzz.checker.BuzzChecker
import fizzbuzz.checker.FizzChecker
import org.junit.jupiter.api.Test

internal class FizzBuzzConverterTest {

    private val fizzBuzzConverter = FizzBuzzConverter(FizzChecker(), BuzzChecker())

    @Test
    fun `Each multiple of 3 must contain Fizz`() {
        for (i in 0..100 step 3) {
            assert(fizzBuzzConverter.convertNumber(i).contains("Fizz"))
        }
    }

    @Test
    fun `Each multiple of 5 must contain Buzz`() {
        for (i in 0..100 step 5) {
            assert(fizzBuzzConverter.convertNumber(i).contains("Buzz"))
        }
    }
}