package exceptions.exercise;

public class Exercise4 extends Exception {
    String exceptionMessage;
    public Exercise4() {}
    public Exercise4(String message) {
        super(message);
        exceptionMessage = message;
    }
    public void printMessgae() {
        System.out.println(exceptionMessage);
    }

    public static void main(String[] args) {
        try {
            throw new Exercise4("Catch it!");
        } catch (Exercise4 e) {
            e.printMessgae();
        }
    }
}
