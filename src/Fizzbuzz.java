public class Fizzbuzz {

    public int number;

    Fizzbuzz(int number) {
        this.number = number;
    }

    public void version1() {
        for (int i = 1; i <= this.number; i++) {
            if (i % 3 == 0 && i % 5 == 0) System.out.println("FizzBuzz");
            else if (i % 3 == 0) System.out.println("Fizz");
            else if (i % 5 == 0) System.out.println("Buzz");
            else System.out.println(i);
        }
    }
    public void version2() {}
}