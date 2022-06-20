package main.java.fizz.buzz;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RangeGenerator {

    public static List<Integer> generateListFromRange(int start, int end){
        return IntStream.rangeClosed(start, end)
                .boxed().collect(Collectors.toList());
    }
}
