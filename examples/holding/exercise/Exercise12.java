package holding.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Exercise12 {
    public static void main(String[] args) {
        final int N = 10;
        List<Integer> ints = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            ints.add(i);
        }
        List<Integer> ints_inverse = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            ints_inverse.add(0);
        }
        ListIterator<Integer> it = ints.listIterator();
        ListIterator<Integer> it_inv = ints_inverse.listIterator(N);
        while (it.hasNext()) {
            it_inv.previous();
            it_inv.set(it.next());
        }
        System.out.println(ints);
        System.out.println(ints_inverse);
    }
}
