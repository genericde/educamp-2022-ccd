import ch.adesso.educamp.fizzbuzz.FizzBuzzConverter
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FizzBuzzConverterTest {
    @Test
    fun fizzBuzzConversionTest() {
        assertEquals("1", FizzBuzzConverter.isFizzBuzz(1))
        assertEquals(FIZZ, FizzBuzzConverter.isFizzBuzz(3))
        assertEquals(BUZZ, FizzBuzzConverter.isFizzBuzz(5))
        assertEquals(FIZZ + BUZZ, FizzBuzzConverter.isFizzBuzz(15))
        assertEquals("14", FizzBuzzConverter.isFizzBuzz(14))
    }

    companion object {
        const val FIZZ = "Fizz"
        const val BUZZ = "Buzz"
    }
}
