package exceptions.exercise;

public class Exercise2 {
    private String s = "Hello";

    public void doSomething() {
        System.out.println("Do something.");
    }

    public static void main(String[] args) {
        Exercise2 e2 = null;
        try {
            e2.doSomething();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
