package holding.exercise;

import java.util.*;

public class Exercise24 {
    private static int counter;
    private final int id = counter++;
    static final String[] movies = {"Star Wars", "Snow White", "Raya and the Last Dragon", "Shock Wave 2"};
    public String toString() {
        return Integer.toString(id);
    }
    public static void main(String[] args) {
        Map<String, Exercise24> m = new LinkedHashMap<>();
        for (String movie : movies) {
            m.put(movie, new Exercise24());
        }
        System.out.println(m);
        Map<String, Exercise24> result = new TreeMap<>(m);
        System.out.println(result);
        m.clear();
        for (Map.Entry<String, Exercise24> a : result.entrySet()) {
            m.put(a.getKey(), a.getValue());
        }
        System.out.println(m);
    }
}

