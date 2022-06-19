package ch.adesso.educamp.fizzbuzz

class FizzBuzzConverter {
    companion object {
        private fun isFizz(number: Int): Boolean {
            return number % 3 == 0
        }

        private fun isBuzz(number: Int): Boolean {
            return number % 5 == 0
        }

        fun isFizzBuzz(number: Int): String {
            val isFizz = isFizz(number)
            val isBuzz = isBuzz(number)
            return if (isFizz && isBuzz) {
                FIZZ + BUZZ
            } else if (isFizz) {
                FIZZ
            } else if (isBuzz) {
                BUZZ
            } else {
                number.toString()
            }
        }

        private const val FIZZ: String = "Fizz"
        private const val BUZZ: String = "Buzz"
    }
}
