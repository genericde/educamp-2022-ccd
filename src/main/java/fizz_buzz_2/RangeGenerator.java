package fizz_buzz_2;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RangeGenerator {
    public static List<Integer> generate() {
        return IntStream.range(1,100).boxed().collect(Collectors.toList());
    }
}
