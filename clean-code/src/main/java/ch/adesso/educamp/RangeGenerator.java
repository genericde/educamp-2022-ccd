package ch.adesso.educamp;

import java.util.ArrayList;
import java.util.List;

public class RangeGenerator {

    static String[] generateRange() {
        List<String> numbers = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            numbers.add(String.valueOf(i));
        }
        return numbers.toArray(new String[0]);
    }

}
