package innerclasses.exercise;

import innerclasses.Sequence;
import innerclasses.Selector;

import java.util.Iterator;


public class Exercise2 {
    public static void main(String[] args) {
        Sequence sq = new Sequence(9);
        for (int i = 0; i < 9; i++) {
            sq.add(new Str(Integer.toString(i)));
        }
        Iterator selector = sq.selector();
        while (selector.hasNext()) {
            System.out.println(selector.next());
        }

    }
}

class Str {
    String s;
    public Str(String s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return s;
    }
}
