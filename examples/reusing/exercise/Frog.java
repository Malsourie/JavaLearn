package exercise;

public class Frog extends Amphibian{
    private void p() {
        System.out.println("Frog print.");
    }

    public static void main(String[] args) {
        Frog f = new Frog();
        f.p();
    }

}

class Amphibian {
    private void p() {
        System.out.println("Amphibian print.");
    }

    public static void print(Amphibian a) {
        a.p();
    }
}
