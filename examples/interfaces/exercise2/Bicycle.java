package interfaces.exercise2;

public class Bicycle implements Cycle{
    @Override
    public void run() {
        System.out.println("Bicycle runs!");
    }

    @Override
    public void stop() {
        System.out.println("Bicycle stops!");
    }

    @Override
    public void turn() {
        System.out.println("Bicycle turns!");
    }

    @Override
    public String toString() {
        return "Bicycle";
    }

    public static void main(String[] args) {
        Cycle c = new Bicycle();
        System.out.println("This is a " + c + ".");
        c.run();
        c.turn();
        c.stop();
    }
}
