package holding.exercise;

import java.util.*;

public class ListFeatures1 {
    public static void main(String[] args) {
        Random rand = new Random(415);
        List<Integer> ints = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            ints.add(rand.nextInt());
        }
        System.out.println("1: " + ints);
        ints.add(5);
        System.out.println("2: " + ints);
        System.out.println("3: " + ints.contains(5));
        ints.remove(5);
        int a = ints.get(2);
        System.out.println("4: " + a + ints.indexOf(a));
        System.out.println("5: " + ints.indexOf(10));
        System.out.println("6: " + ints.remove(Integer.valueOf(10)));
        System.out.println("7: " + ints.remove(Integer.valueOf(a)));
        System.out.println("8: " + ints);
        ints.add(3, 415);
        System.out.println("9: " + ints);
        List<Integer> sub = ints.subList(1, 4);
        System.out.println("subList: " + sub);
        System.out.println("10: " + ints.containsAll(sub));
        Collections.sort(sub);
        System.out.println("sorted subList: " + sub);
        System.out.println("11: " + ints.containsAll(sub));
        Collections.shuffle(sub, rand);
        System.out.println("shuffled subList: " + sub);
        System.out.println("12: " + ints.containsAll(sub));
        List<Integer> copy = new ArrayList<>(ints);
        sub = Arrays.asList(ints.get(1), ints.get(5));
        System.out.println("sub: " + sub);
        copy.retainAll(sub);
        System.out.println("13: " + copy);
        copy = new ArrayList<>(ints);
        copy.remove(3);
        System.out.println("14: " + copy);
        copy.retainAll(sub);
        System.out.println("15: " + copy);
        copy.set(1, 3);
        System.out.println("16: " + copy);
        copy.addAll(2, sub);
        System.out.println("17: " + copy);
        System.out.println("18: " + ints.isEmpty());
        ints.clear();
        System.out.println("19: " + ints);
        System.out.println("19*: " + copy);
        System.out.println("20: " + ints.isEmpty());
        ints.addAll(copy.subList(0, 4));
        System.out.println("21: " + ints);
        Object[] o = ints.toArray();
        System.out.println("22: " + o[3]);
        Integer[] ia = ints.toArray(new Integer[0]);
        System.out.println("23: " + ia[3]);
    }
}
