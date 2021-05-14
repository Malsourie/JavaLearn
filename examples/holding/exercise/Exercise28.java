package holding.exercise;

import java.util.PriorityQueue;
import java.util.Random;

public class Exercise28 {
    public static void main(String[] args) {
        Random rand = new Random(415);
        PriorityQueue<Double> doubles = new PriorityQueue<>();
        for (int i = 0; i < 33; i++) {
            doubles.offer(rand.nextDouble());
        }
        while (doubles.peek() != null) {
            System.out.println(doubles.poll());
        }
    }
}
