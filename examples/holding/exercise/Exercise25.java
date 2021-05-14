package holding.exercise;

import net.mindview.util.TextFile;

import java.util.*;

public class Exercise25 {
    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> m = new LinkedHashMap<>();
        List<String> words = new LinkedList<>(new TextFile("/home/chunyuan/Documents/Thinking_in_Java/examples/holding/SetOperations.java", "\\W+"));
        int counter = 0;
        for (String word : words) {
            ArrayList<Integer> a = m.get(word);
            if (a == null) {
                m.put(word, new ArrayList<>());
                m.get(word).add(counter);
            }
            else {
                a.add(counter);
            }
            counter++;
        }
        System.out.println(m);
    }
}
