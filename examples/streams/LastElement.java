package streams;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LastElement {
    public static void main(String[] args) {
        OptionalInt last = IntStream.range(10, 20)
                .reduce((n1, n2) -> n2);
        System.out.println(last.orElse(-1));

        Optional<String> laststr = Stream.of("One", "Two", "Three")
                .reduce((n1, n2) -> n2);
        System.out.println(laststr.orElse("Nothing there!"));
    }
}
