package exceptions.exercise;

public class Exercise3 {
    public static void main(String[] args) {
        int[] ints = new int[10];
        for (int i = 0; i < 10; i++) {
            ints[i] = i;
        }
        try {
            int j = ints[11];
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }
}
