package functional;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Supplier;

public class Closure8 {
    Supplier<List<Integer>> makeFun() {
        List<Integer> ai = new LinkedList<>();
        ai.add(1);
        return () -> ai;
    }

    public static void main(String[] args) {
        Closure8 c8 = new Closure8();
        List<Integer>
                l1 = c8.makeFun().get(),
                l2 = c8.makeFun().get();
        System.out.println(l1);
        System.out.println(l2);
        l1.add(415);
        l2.add(33);
        System.out.println(l1);
        System.out.println(l2);
    }
}
