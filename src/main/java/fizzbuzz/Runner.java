package fizzbuzz;

import java.util.ArrayList;
import java.util.List;

public class Runner {

    public void generateResultList(){
        NumberGenerator generator = new NumberGenerator();
        NumberValidator validator = new NumberValidator();
        List<Integer> arrayList = generator.generateNumbersOne2Hundred();

        List<String> resultList = new ArrayList<>();
        arrayList.forEach((item) -> {
            resultList.add(validator.replaceNumberWithFizzBuzz(item));
        });
        printListToConsole(resultList);
    }

    private void printListToConsole(List<String> list){
        list.forEach(item -> System.out.println(item));
    }
}
