package streams;

import java.util.Random;
import java.util.stream.Stream;

public class Reduce {
    public static void main(String[] args) {
        Stream.generate(Frobnitz::supply)
                .limit(10)
                .peek(System.out::println)
                .reduce((((frobnitz, frobnitz2) -> frobnitz.size < 50 ? frobnitz : frobnitz2)))
                .ifPresent(System.out::println);
    }
}

class Frobnitz {
    int size;
    public Frobnitz(int sz) {
        size = sz;
    }
    @Override
    public String toString() {
        return "Frobnitz(" + size + ")";
    }
    static Random rand = new Random(415);
    static final int BOUND = 100;
    static Frobnitz supply() {
        return new Frobnitz(rand.nextInt(BOUND));
    }
}
