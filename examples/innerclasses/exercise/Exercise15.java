package innerclasses.exercise;

public class Exercise15 {
    public FirstWithConstructor getClass(final int i) {
        return new FirstWithConstructor(i) {
            @Override
            public void showI() {
                System.out.println(getI());
            }
        };
    }

    public static void main(String[] args) {
        Exercise15 e15 = new Exercise15();
        FirstWithConstructor fwc = e15.getClass(33);
        fwc.showI();
    }


}

abstract class FirstWithConstructor {
    private int i;
    public FirstWithConstructor(int i) {
        this.i = i;
    }
    public int getI() {
        return i;
    }
    public abstract void showI();
}
