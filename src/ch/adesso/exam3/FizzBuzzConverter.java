package ch.adesso.exam3;

import java.util.ArrayList;
import java.util.List;

public final class FizzBuzzConverter {
    public static List<String> convert(List<Integer> number){
        List<String> result = new ArrayList<>();
        for (Integer integer: number){
            if(integer % 5 == 0 && integer % 3 == 0)
                result.add("FizzBuzz");
            else if(integer % 5 == 0)
                result.add("Fizz");
            else if (integer % 3 == 0)
                result.add("Buzz");
            else
                result.add(integer.toString());
        }
        return result;
    }
}
