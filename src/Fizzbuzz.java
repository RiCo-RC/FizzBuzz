import java.util.HashMap;

public class Fizzbuzz {

    // -- VARIABLES -- \\

    public int number;
    public int[] numbers;
    public HashMap<Integer, String> config = new HashMap<Integer, String>();

    // -- CONSTRUCTOR -- \\

    public Fizzbuzz() {};

    public Fizzbuzz(int number) {
        this.number = number;
    }

    // -- HELPERS -- \\

    public void checkNumber(int number) {
        if (number % 3 == 0 && number % 5 == 0) System.out.println("FizzBuzz");
        else if (number % 3 == 0) System.out.println("Fizz");
        else if (number % 5 == 0) System.out.println("Buzz");
        else System.out.println(number);
    }

    public String checkNumber2(int number) {
        String value = "FizzBuzz";
        if (number % 3 == 0) value = "Fizz";
        if (number % 5 == 0) value = "Buzz";
        else value = String.valueOf(number);
        return value;
    }

    public StringBuilder checkNumber3(int number) {
        StringBuilder value = new StringBuilder();
        if (number % 3 == 0) value.append("Fizz");
        if (number % 5 == 0) value.append("Buzz");
        else value.append(number);
        return value;
    }

    public void generateNumbers(int number) {
        for (int i = 0; i <= number; i++) {
            this.numbers[i] = i;
        }
    }

    public void generateConfig(int number, String str) {
        //for (Integer i : config.keySet()) {
            //if (config.get(i).isEmpty()) config.put(number, str);
        //}
        config.put(number, str);
    }

    // -- METHODS -- \\

    public void version1_0(int number) {
        for (int i = 1; i <= number; i++) {
            checkNumber(i);
        }
    }

    public void version1_3(int number) {
        this.generateNumbers(number);
        for (int num: this.numbers) {
            checkNumber2(num);
        }
    }

    public void version2() {
        this.generateNumbers(number);
        for (int num: this.numbers) {
            checkNumber3(num);
        }
    }

    public void version3() {
        StringBuilder value = new StringBuilder();
        this.generateNumbers(number);
        for (int num: this.numbers) {
            for (Integer i : config.keySet()) {
                if (num % i == 0) value.append(config.get(i));
            }
            if (value.toString().isEmpty()) value.append(num);
        }
        System.out.println(value);
    }
}