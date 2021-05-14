package holding.exercise;

import java.util.PriorityQueue;

public class Exercise29 implements Comparable{
    private static int counter;
    private final int a = counter++;

    public String toString() {
        return (Integer.toString(a));
    }

    public int getA() {
        return a;
    }

    @Override
    public int compareTo(Object e) {
        return a - ((Exercise29)e).getA();
    }

    public static void main(String[] args) {
        PriorityQueue<Exercise29> e29 = new PriorityQueue<>();
        for (int i = 0; i < 10; i++) {
            e29.offer(new Exercise29());
        }
        while (e29.peek() != null) {
            System.out.println(e29.remove());
        }
    }
}
