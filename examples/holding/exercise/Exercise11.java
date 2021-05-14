package holding.exercise;

import java.util.*;

public class Exercise11 {
    public static Collection<Test> fill(Collection<Test> t) {
        for (int i = 0; i < 10; i++) {
            t.add(new Test());
        }
        return t;
    }

    public static void print(Iterator<Test> it) {
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Collection<Test> t;
        Iterator<Test> it;
        t = fill(new ArrayList<Test>());
        it = t.iterator();
        print(it);
        t = fill(new LinkedList<Test>());
        it = t.iterator();
        print(it);
        t = fill(new HashSet<Test>());
        it = t.iterator();
        print(it);
//        t = fill(new TreeSet<Test>());
//        it = t.iterator();
//        print(it);
    }
}

class Test {
    private static int counter;
    private final int id = counter++;

    public String toString() {
        return "" + id;
    }
}
