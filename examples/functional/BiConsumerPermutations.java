package functional;

import java.util.function.BiConsumer;

public class BiConsumerPermutations {
    static BiConsumer<Integer, Double> bicid = (i, d) -> System.out.format("%d %f%n", i, d);
    static BiConsumer<Double, Integer> bicdi = (d, i) -> System.out.format("%f %d%n", d, i);
    static BiConsumer<Integer, Long> bicil = (i, l) -> System.out.format("%d %d%n", i, l);

    public static void main(String[] args) {
        bicid.accept(415, 12.34);
        bicdi.accept(23.45, 33);
        bicil.accept(1, 11L);
    }
}
