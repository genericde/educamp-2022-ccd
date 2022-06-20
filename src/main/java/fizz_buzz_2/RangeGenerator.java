package fizz_buzz_2;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RangeGenerator {
    public static List<Integer> generate(int min, int max) {
        return IntStream.range(min, max).boxed().collect(Collectors.toList());
    }
}
