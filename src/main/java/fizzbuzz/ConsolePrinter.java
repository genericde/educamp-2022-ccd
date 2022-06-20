package fizzbuzz;

import java.util.List;

public class ConsolePrinter {
    public static void printListToConsole(List<String> list){
        list.forEach(item -> System.out.println(item));
    }

}
