package exercise;

public class Exercise20 {
    public static void main(String... args) {
        System.out.print(args.length);
        for (String s : args) {
            System.out.print(" " + s);
        }
        System.out.println();
    }
}
