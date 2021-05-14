package interfaces.exercise;

import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

public class AdaptedCharSequence extends RandomChars implements Readable {
    private int count;
    public AdaptedCharSequence(int i) {
        count = i;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(new AdaptedCharSequence(5));
        while (s.hasNext()) {
            System.out.println(s.next());
        }
    }

    @Override
    public int read(CharBuffer cb) {
        if (count-- == 0) return -1;
        RandomChars rcs = new RandomChars();
        char[] chars = rcs.nextSequence();
        for (int i = 0; i < rcs.length(); i++) {
            cb.append(chars[i]);
        }
        cb.append(" ");
        return rcs.length();
    }
}

class RandomChars {
    private static Random rand = new Random(33);
    private static final int N = 5;

    public char next() {
        return (char) (rand.nextInt(26) + (int) 'a');
    }

    public char[] nextSequence() {
        char[] chars = new char[N];
        for (int i = 0; i < N; i++) {
            chars[i] = next();
        }
        return chars;
    }

    public int length() {
        return N;
    }

}
