package streams;

import java.util.Comparator;

public class SortedComparator {
    public static void main(String[] args) throws Exception {
        FileToWords.stream("Cheese.dat")
                .skip(10)
                .limit(10)
                .sorted(Comparator.reverseOrder())
                .map(s -> s + " ")
                .forEach(System.out::print);
    }
}
