package exercise;

public class Fibonacci {

    public static int fibonacci(int index) {
        switch (index) {
            case 0:
            case 1:
                return 1;
            default:
                return fibonacci(index - 1) + fibonacci(index - 2);
        }
    }

    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        System.out.print(a + " " + b + " ");
        for (int i = 2; i < Integer.parseInt(args[0]); i++) {
            a += b;
            b = a - b;
            System.out.print(a + " ");
        }
        System.out.println();
    }
}
