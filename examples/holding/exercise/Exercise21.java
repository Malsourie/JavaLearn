package holding.exercise;

import net.mindview.util.TextFile;

import java.util.*;

public class Exercise21 {
    private final String word;
    private int counter;
    public Exercise21(String word) {
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    public void addCounter(int occurrence) {
        counter += occurrence;
    }

    public String toString() {
        return word + ": " + counter;
    }

    public static void main(String[] args) {
        List<String> words = new LinkedList<>(new TextFile("/home/chunyuan/Documents/Thinking_in_Java/examples/holding/SetOperations.java", "\\W+"));
        Map<String, Integer> result = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
        Set<String> uniqueWords = new LinkedHashSet<>(words);
        for (String word : uniqueWords) {
            result.put(word, Collections.frequency(words, word));
        }
        System.out.println(result);

        Set<Exercise21> e22 = new HashSet<>();
        for (String word : uniqueWords) {
            e22.add(new Exercise21(word));
        }
        Iterator<Exercise21> it = e22.iterator();
        while (it.hasNext()) {
            Exercise21 e = it.next();
            e.addCounter(Collections.frequency(words, e.getWord()));
        }
        System.out.println(e22);
    }
}
