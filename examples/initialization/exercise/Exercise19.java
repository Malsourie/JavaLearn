package exercise;

public class Exercise19 {
    public Exercise19(String... args) {
        System.out.println(args.length);
        for (String s : args) {
            System.out.print(" " + s);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Exercise19 e1 = new Exercise19("a", "bb", "ccc");
        Exercise19 e2 = new Exercise19(new String[]{"a", "bb", "ccc"});
    }
}
