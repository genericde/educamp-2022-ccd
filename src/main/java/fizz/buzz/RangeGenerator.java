package main.java.fizz.buzz;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RangeGenerator {

    private int end = 0;
    private int start = 0;

    public RangeGenerator(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public List<Integer> generateListFromRange(){
        return IntStream.rangeClosed(this.start, this.end)
                .boxed().collect(Collectors.toList());
    }
}
