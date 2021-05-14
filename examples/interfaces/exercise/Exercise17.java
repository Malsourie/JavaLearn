package interfaces.exercise;

import java.util.Random;

public class Exercise17 implements Test{
    public static void main(String[] args) {
        Exercise17 e17 = new Exercise17();
        System.out.println(e17.a);
        Exercise17 e17_2 = new Exercise17();
        System.out.println((e17_2.a));

    }
}

interface Test {
    Random rand = new Random(47);
    int a = rand.nextInt(100);
}
