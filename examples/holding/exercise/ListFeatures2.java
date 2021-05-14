package holding.exercise;

import java.awt.desktop.SystemEventListener;
import java.lang.reflect.Array;
import java.util.*;

import static java.lang.Math.abs;

public class ListFeatures2 {
    public static void main(String[] args) {
        Random rand = new Random(415);
        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            stringList.add("" + (char)('a' + abs(rand.nextInt()) % 26));
        }
        System.out.println("1: " + stringList);
        String h = "Hamster";
        stringList.add(h);
        System.out.println("2: " + stringList);
        System.out.println("3: " + stringList.contains(h));
        stringList.remove(h);
        String s = stringList.get(2);
        System.out.println("4: " + s + stringList.indexOf(s));
        String cymric = "a";
        System.out.println("5: " + stringList.indexOf(cymric));
        System.out.println("6: " + stringList.remove(cymric));
        System.out.println("7: " + stringList.remove(s));
        System.out.println("8: " + stringList);
        stringList.add(3, "Mouse");
        System.out.println("9: " + stringList);
        List<String> sub = stringList.subList(1, 4);
        System.out.println("subList: " + sub);
        System.out.println("10: " + stringList.containsAll(sub));
        Collections.sort(sub);
        System.out.println("sorted subList: " + sub);
        System.out.println("11: " + stringList.containsAll(sub));
        Collections.shuffle(sub, rand);
        System.out.println("shuffled subList: " + sub);
        System.out.println("12: " + stringList.containsAll(sub));
        List<String> copy = new ArrayList<>(stringList);
        sub = Arrays.asList(stringList.get(1), stringList.get(5));
        System.out.println("sub: " + sub);
        copy.retainAll(sub);
        System.out.println("13: " + copy);
        copy = new ArrayList<>(stringList);
        copy.remove(2);
        System.out.println("14: " + copy);
        copy.removeAll(sub);
        System.out.println("15: " + copy);
        copy.set(1, "Mouse");
        System.out.println("16: " + copy);
        copy.addAll(2, sub);
        System.out.println("17: " + copy);
        System.out.println("18: " + stringList.isEmpty());
        stringList.clear();
        System.out.println("19: " + stringList);
        System.out.println("20: " + stringList.isEmpty());
        stringList.addAll(copy.subList(0, 5));
        System.out.println("21: " + stringList);
        Object[] o = stringList.toArray();
        System.out.println("22: " + o[3]);
        String[] sl = stringList.toArray(new String[0]);
        System.out.println("23: " + sl[3]);
    }
}
