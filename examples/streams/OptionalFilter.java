package streams;

import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class OptionalFilter {
    static String[] elements = {"Foo", "", "Bar", "Baz", "Bingo"};
    static Stream<String> testStream() {
        return Arrays.stream(elements);
    }

    static void test(String descr, Predicate<String> pred) {
        System.out.println(" ---( " + descr + " )--- ");
        for (int i = 0; i <= elements.length; i++) {
            System.out.println(
                    testStream()
                        .skip(i)
                        .findFirst()
                        .filter(pred)
            );
        }
    }

    public static void main(String[] args) {
        test("true", s -> true);
        test("false", s -> false);
        test("str != \"\"", s -> !s.equals(""));
        test("str.length() == 3", s -> s.length() == 3);
        test("startsWith(\"B\"", s -> s.startsWith("B"));
    }
}
