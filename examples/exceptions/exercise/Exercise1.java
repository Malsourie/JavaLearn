package exceptions.exercise;

public class Exercise1 {
    public static void main(String[] args) {
        try {
            throw new Exception("In Exception.");
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }
}
