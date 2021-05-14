package streams;

public class Peeking {
    public static void main(String[] args) throws Exception {
        FileToWords.stream("Cheese.dat")
                .skip(21)
                .limit(4)
                .map(s -> s + " ")
                .peek(System.out::print)
                .map(String::toUpperCase)
                .peek(System.out::print)
                .map(String::toLowerCase)
                .forEach(System.out::print);
    }
}
