package exercise;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int a = num;
        StringBuilder b = new StringBuilder(10);

        for (int i=0; Math.pow(2,i) <= num; i++) {
            b.append(a % 2 == 0? 0:1);
            a = a / 2;
        }
        System.out.println(b.reverse());
    }
}
