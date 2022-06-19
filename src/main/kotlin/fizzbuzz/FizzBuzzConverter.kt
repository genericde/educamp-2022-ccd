package fizzbuzz

import fizzbuzz.checker.BuzzChecker
import fizzbuzz.checker.FizzChecker

class FizzBuzzConverter(
    private val fizzChecker: FizzChecker,
    private val buzzChecker: BuzzChecker
) {
    fun convertNumber(number: Int): String {
        return when {
            fizzChecker.isFizz(number) && buzzChecker.isBuzz(number) -> "FizzBuzz"
            fizzChecker.isFizz(number) -> "Fizz"
            buzzChecker.isBuzz(number) -> "Buzz"
            else -> number.toString()
        }
    }
}