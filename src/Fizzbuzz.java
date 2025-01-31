import java.util.HashMap;

public class Fizzbuzz {

    public HashMap<Integer, String> config = getConfig();

    public void isDivisibleBy(int value, int key) {};

    public Object transformToStringBuilder(HashMap<Integrer, String> config, int value) {
        StringBuilder result = new StringBuilder();

        for (Integer key : config.keySet()) {
            if (isDivisibleBy(value, key)) {
                result.append(config.get(key));
            }
        }

        if (result.isEmpty()) result.append(value);

        return result.toString();
    }

    public loop(int end) {
        for (int i = 1; i <= end; i++) {
            System.out.println(this.transformToStringBuilder(config, i);
        }
    }
}