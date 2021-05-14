package functional;

public class TriFunctionTest {
    static int f(int i, long l, double d) { return 99; }

    public static void main(String[] args) {
        TriFunction<Integer, Long, Double, Integer> tf = (i, l, d) -> 415;
        tf = TriFunctionTest::f;
    }
}
