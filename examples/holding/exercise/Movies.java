package holding.exercise;

import java.util.*;

class FillMovies {
    static final String[] movies = {"Star Wars", "Snow White", "Raya and the Last Dragon", "Shock Wave 2"};
    private int i;

    public String next() {
        return movies[i++ % 4];
    }

    public void fill(Collection<String> c) {
        for (int i = 0; i < 10; i++) {
            c.add(next());
        }
    }
}


public class Movies {
    public static void main(String[] args) {
        FillMovies fm = new FillMovies();
        ArrayList<String> al = new ArrayList<>();
        LinkedList<String> ll = new LinkedList<>();
        HashSet<String> hs = new HashSet<>();
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        TreeSet<String> ts = new TreeSet<>();
        fm.fill(al);
        fm.fill(ll);
        fm.fill(hs);
        fm.fill(lhs);
        fm.fill(ts);
        System.out.println(al);
        System.out.println(ll);
        System.out.println(hs);
        System.out.println(lhs);
        System.out.println(ts);
    }

}
