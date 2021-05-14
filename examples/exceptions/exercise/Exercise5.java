package exceptions.exercise;

import java.util.stream.StreamSupport;

public class Exercise5 {
    private int counter;
    public int getCounter() {
        return counter;
    }
    public void addCounter() {
        counter++;
    }
    public void doIt() throws Exception {
        if (counter <= 5) {
            throw new Exception("Counter is not big enough, and equals to " + counter + ".");
        }
    }
    public static void main(String[] args) {
        Exercise5 e5 = new Exercise5();
        while (true) {
            try {
                e5.doIt();
                break;
            } catch (Exception e) {
                e.printStackTrace(System.out);
                e5.addCounter();
            }
        }
        System.out.println(e5.getCounter());
    }
}
