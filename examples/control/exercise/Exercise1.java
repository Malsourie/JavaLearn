package exercise;

import java.util.Random;

public class Exercise1 {

    public static void main(String[] args) {
        int[] number = new int[25];
        Random rand = new Random();
        for (int i = 0; i < number.length; i++) number[i] = rand.nextInt();
        String[] relation = new String[24];

        for (int i = 0; i < relation.length; i++) {
            int i1 = number[i] - number[i + 1];
            if (i1 > 0) relation[i] = "larger";
            else if (i1 < 0) relation[i] = "less";
            else relation[i] = "equal";
        }

        for (String s : relation) {
            System.out.println(s);
        }
    }
}
