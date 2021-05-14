package innerclasses.exercise;

interface Inner2 {
    void increaseI();
}

public class Exercise7 {
    private int i = 7;
    private void showI() {
        System.out.println(i);
    }

    public void toInner() {
        Inner2 in = new Inner2() {
            public void increaseI() {
                i++;
                showI();
            }
        };
        in.increaseI();
    }

    public static void main(String[] args) {
        Exercise7 e7 = new Exercise7();
        e7.toInner();
        e7.toInner();
    }
}
