package interfaces.exercise;

public class RealPrint extends Print {
    int i = 7;

    @Override
    public void print() {
        System.out.println(i);
    }

    public static void main(String[] args) {
        RealPrint rp = new RealPrint();
        rp.print();
    }
}
