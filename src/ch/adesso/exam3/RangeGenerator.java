package ch.adesso.exam3;

import java.util.ArrayList;
import java.util.List;

public final class RangeGenerator {

    public static List<Integer> generateRange(){
        List<Integer> range = new ArrayList<>();
        for (int i = 1; i <= 100; i++){
            range.add(i);
        }
        return range;
    }
}
