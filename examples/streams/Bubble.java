package streams;

public class Bubble {
    public final int i;
    public Bubble(int i) {
        this.i = i;
    }

    @Override
    public String toString() {
        return "Bubble(" + i +")";
    }

    private static int counter;
    public static Bubble bubbler() {
        return new Bubble(counter++);
    }
}
