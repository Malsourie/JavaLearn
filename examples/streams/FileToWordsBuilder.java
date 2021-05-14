package streams;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileToWordsBuilder {
    Stream.Builder<String> builder = Stream.builder();

    public FileToWordsBuilder(String path) throws Exception {
        Files.lines(Paths.get(path))
                .skip(1)
                .forEach(line -> {
                    for (String word : line.split("[ .?,]+")) {
                        builder.add(word);
                    }
                });
    }

    Stream<String> stream() {
        return builder.build();
    }

    public static void main(String[] args) throws Exception {
        new FileToWordsBuilder("Cheese.dat")
                .stream()
                .limit(7)
                .map(s -> s + " ")
                .forEach(System.out::print);
    }
}
