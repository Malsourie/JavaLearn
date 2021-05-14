package exercise;

public class Exercise14 {
    private static String s1 = "abc";
    private static String s2;

    static {
        s2 = "def";
    }

    public static void print() {
        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);
    }

    public static void main(String[] args) {
        Exercise14.print();
    }
}
