package interfaces.exercise;

import java.util.Random;

interface Game { void play(); }
interface GameFactory { Game getGame(); }

class ThrowingCoin implements Game {
    private static Random rand = new Random(System.currentTimeMillis());

    private ThrowingCoin() {}

    public void play() {
        int n = rand.nextInt(2);
        if (n == 0) System.out.println("Coin up.");
        else System.out.println("Coin down.");
    }
    public static GameFactory factory = new GameFactory() {
        @Override
        public Game getGame() {
            return new ThrowingCoin();
        }
    };
}


class ThrowingDice implements Game {
    private static Random rand = new Random(System.currentTimeMillis());

    private ThrowingDice() {};

    public void play() {
        int n = rand.nextInt(6);
        switch (n) {
            default -> System.out.println("Dice: 1.");
            case 1 -> System.out.println("Dice: 2.");
            case 2 -> System.out.println("Dice: 3");
            case 3 -> System.out.println("Dice: 4");
            case 4 -> System.out.println("Dice: 5");
            case 5 -> System.out.println("Dice: 6");
        }
    }

    public static GameFactory factory = new GameFactory() {
        @Override
        public Game getGame() {
            return new ThrowingDice();
        }
    };
}



public class Games {
    public static void playGame(GameFactory gf) {
        Game g = gf.getGame();
        g.play();
    }

    public static void main(String[] args) {
        playGame(ThrowingCoin.factory);
        playGame(ThrowingDice.factory);
    }
}
