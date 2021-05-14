package exercise;

public class Exercise4 {
    public static void main(String[] args) {
        System.out.println(2);
        a: for (int i=3; i<100; i++) {
            for (int j=2; j<i-1; j++) {
                if (i % j == 0) continue a;
            }
            System.out.println(i);
        }
    }
}
