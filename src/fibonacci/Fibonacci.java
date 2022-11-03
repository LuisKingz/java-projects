package fibonacci;

public class Fibonacci {

    private int fibonacci(int num) {
        if (num == 0 || num == 1) {
            return num;
        } else {
            return fibonacci(num - 1) + fibonacci(num - 2);
        }
    }

    public static void main(String[] args) {

        Fibonacci fib = new Fibonacci();

        for (int i = 0; i < 20; i++) {
            System.out.println((i + 1) + " - " + fib.fibonacci(i));
        }
    }
}
