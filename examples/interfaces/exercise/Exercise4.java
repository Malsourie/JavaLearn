package interfaces.exercise;


public class Exercise4 extends Base{
    public void hello() {
        System.out.println("Hello");
    }

    public static void transfer(Base b) {
        b.hello();
    }

    public static void main(String[] args) {
        Base b = new Exercise4();
        Exercise4.transfer(b);

    }
}

abstract class Base {
    public abstract void hello();

}
