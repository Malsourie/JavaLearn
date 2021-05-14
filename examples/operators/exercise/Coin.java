package exercise;

import java.util.Random;

public class Coin {
    private Random coin;

    public Coin() {
        coin = new Random(47);
    }

    public void throw_coin() {
        boolean num = coin.nextBoolean();
        if (num) { System.out.println("up"); }
        else { System.out.println("down"); }
    }

    public static void main(String[] args) {
        Coin coin = new Coin();
        for (int i=0; i<5; i++) {
            coin.throw_coin();
        }
    }
}
