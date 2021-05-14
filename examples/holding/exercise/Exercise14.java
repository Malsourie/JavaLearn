package holding.exercise;

import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

public class Exercise14 {
    public static void main(String[] args) {
        LinkedList<Integer> ints = new LinkedList<>();
        Collections.addAll(ints, 1, 2);
        ListIterator<Integer> it = ints.listIterator(1);
        for (int i = 3; i < 10; i++) {
            it.add(i);
            it.previous();
        }
        System.out.println(ints);
    }
}
