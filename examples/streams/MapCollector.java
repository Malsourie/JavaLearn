package streams;

import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapCollector {
    public static void main(String[] args) {
        Map<Character, Integer> map =
                new RandomPair().stream()
                    .limit(8)
                    .collect(Collectors.toMap(Pair::getC, Pair::getI));
        System.out.println(map);
    }
}

class Pair {
    public final Character c;
    public final Integer i;
    public Pair(Character c, Integer i) {
        this.c = c;
        this.i = i;
    }

    public Character getC() {
        return c;
    }

    public Integer getI() {
        return i;
    }

    @Override
    public String toString() {
        return "Pair(" + c + ", " + i + ")";
    }
}

class RandomPair {
    Random rand = new Random(415);
    Iterator<Character> capChars = rand.ints(65, 91)
            .mapToObj(i -> (char)i)
            .iterator();
    public Stream<Pair> stream() {
        return rand.ints(100, 1000).distinct()
                .mapToObj(i -> new Pair(capChars.next(), i));
    }
}
