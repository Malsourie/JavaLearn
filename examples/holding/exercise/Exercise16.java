package holding.exercise;

import net.mindview.util.TextFile;

import java.beans.IntrospectionException;
import java.util.*;

public class Exercise16 {
    public static int count(String s, char c) {
        int counter = 0;
        String toTest = Character.toString(c);
        int position = s.indexOf(toTest);

        while (position != -1) {
            counter++;
            position = s.indexOf(toTest, ++position);
        }
        return counter;
    }
    
    public static void main(String[] args) {
        List<String> words = new LinkedList<>();
        words.addAll(new TextFile("/home/chunyuan/Documents/Thinking_in_Java/examples/holding/SetOperations.java", "\\W+"));
        System.out.println(words);
        Set<Character> vowels = new HashSet<>();
        vowels.addAll(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        Map<Character, Integer> alphaCounter = new TreeMap<>();
        for (String word : words) {
            for (Character vowel : vowels) {
                int count = count(word, vowel);
                Integer previousCounter = alphaCounter.get(vowel);
                alphaCounter.put(vowel, previousCounter == null? count: previousCounter + count);
            }
        }
        System.out.println(alphaCounter);
    }
}
