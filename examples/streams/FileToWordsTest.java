package streams;

import java.io.IOException;

public class FileToWordsTest {
    public static void main(String[] args) throws IOException {
        FileToWords.stream("Cheese.dat")
                .limit(7)
                .forEach(s -> System.out.format("%s ", s));
        System.out.println();
        FileToWords.stream("Cheese.dat")
                .skip(7)
                .limit(2)
                .forEach(s -> System.out.format("%s ", s));
    }
}
