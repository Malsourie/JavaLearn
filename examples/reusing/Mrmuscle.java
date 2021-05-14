public class Mrmuscle extends Detergent {
    @Override
    public void scrub() {
        System.out.print(" Mrmuscle scrub() ");
        super.scrub();
    }

    public void sterilize() {
        System.out.print(" sterilize() ");
    }

    public static void main(String[] args) {
        Mrmuscle m = new Mrmuscle();
        m.dilute();
        m.apply();
        m.scrub();
        m.sterilize();
    }
}
