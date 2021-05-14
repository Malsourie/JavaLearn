package streams;

import java.util.stream.Stream;

public class FunctionMap3 {
    public static void main(String[] args) {
        Stream.of("5", "7", "9")
                .mapToInt(Integer::parseInt)
                .forEach(i -> System.out.format("%d ", i));
        System.out.println();

        Stream.of("17", "19", "23")
                .mapToLong(Long::parseLong)
                .forEach(i -> System.out.format("%d ", i));
        System.out.println();

        Stream.of("17", "1.9", ".23")
                .mapToDouble(Double::parseDouble)
                .forEach(i -> System.out.format("%f ", i));
        System.out.println();
    }
}
