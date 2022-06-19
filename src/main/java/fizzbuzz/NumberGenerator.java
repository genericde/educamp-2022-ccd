package fizzbuzz;

import java.util.ArrayList;
import java.util.List;

public class NumberGenerator {
     public List<Integer> generateNumbersOne2Hundred() {
         ArrayList<Integer> integerArrayList = new ArrayList<>();
         for (int i = 1; i < 101; i++) {
             integerArrayList.add(i);
         }
         return integerArrayList;
     }

}
