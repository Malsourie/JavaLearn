package exercise;

import java.lang.reflect.Array;
import java.util.Arrays;

public class VampireNumber {
    public static void main(String[] args) {
        char[] num_char;
        char[] multiplier_char;
        for (int i = 11; i < 99; i++) {
            for (int j = 11; j < i; j++) {
                int product = i * j;
                if (1000 >= product || 10000 <= product && product % 100 == 0) continue;
                num_char = ("" + product).toCharArray();
                multiplier_char = ("" + i + j).toCharArray();
                Arrays.sort(num_char);
                Arrays.sort(multiplier_char);
                if (Arrays.equals(num_char, multiplier_char)) {
                    System.out.println(product + " = " + j + " * " + i);
                }
            }
        }
    }
}
