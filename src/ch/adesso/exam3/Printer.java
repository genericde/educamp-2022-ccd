package ch.adesso.exam3;

import java.util.List;

public final class Printer {
    public static void print(List<String> result){
        for (String resultString: result) {
            System.out.println(resultString);
        }
    }
}
