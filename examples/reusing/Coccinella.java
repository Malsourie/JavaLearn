import static net.mindview.util.Print.*;

public class Coccinella extends Beetle{
    private static int x3 = printInit("static Coccinella.x3 initialized");
    private int l = printInit("Coccinella.l initialized.");
    public Coccinella() {
        print("Coccinella Constructor.");
    }

    public static void main(String[] args) {
        Coccinella c = new Coccinella();
    }
}
