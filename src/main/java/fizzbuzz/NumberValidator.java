package fizzbuzz;

public class NumberValidator {

    public String replaceNumberWithFizzBuzz(Integer number){
      StringBuilder stringBuilder = new StringBuilder();


        if (number % 3 == 0){
            stringBuilder.append("FIZZ");
        }

        if (number % 5 == 0){
            stringBuilder.append("BUZZ");
        }

        if (number % 3 != 0 && number % 5 != 0){
            stringBuilder.append(String.valueOf(number));
        }

        return  stringBuilder.toString();
    }
}