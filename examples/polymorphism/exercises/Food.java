package polymorphism.exercises;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

interface Rodent {
    void eat();
//    public abstract void eatt(Rodent r);
}

class Mouse implements Rodent {
    private static int counter;
    private int id = counter++;
    @Override
    public void eat() {
        System.out.println("Mouse.eat()" + id);
    }
    public static void eatt(Mouse r) { System.out.println("Rodent.eat()" + r.id); }
}

class Gerbil implements Rodent {
    private static int counter;
    private int id = counter++;
    @Override
    public void eat() {
        System.out.println("Gerbil.eat()" + id);
    }
    public static void eatt(Gerbil r) { System.out.println("Gerbil.eat()" + r.id); }
}

class Hamster implements Rodent {
    private static int counter;
    private int id = counter++;
    @Override
    public void eat() {
        System.out.println("Hamster.eat()" + id);
    }
    public static void eatt(Hamster r) { System.out.println("Hamster.eat()" + r.id); }
}

class RodentGenerator {
    private Random rand = new Random(47);

    public Rodent randomChoice() {
        return switch (rand.nextInt(3)) {
            default -> new Mouse();
            case 1 -> new Gerbil();
            case 2 -> new Hamster();
        };
    }
}

public class Food {
    public static void eaten(Rodent r) {
        r.eat();
    }
    public static void main(String[] args) {
        List<Rodent> r = new ArrayList<>();
        RodentGenerator rg = new RodentGenerator();
        for (int i = 0; i < 10; i++) {
            r.add(rg.randomChoice());
        }
        Iterator<Rodent> it = r.iterator();
        while (it.hasNext()) {
            it.next().eat();
        }
    }
}
