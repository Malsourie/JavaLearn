package exceptions.exercise;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

public class Exercise7 {
    public static void main(String[] args) {
        int[] ints = new int[10];
        Logger logger = Logger.getLogger("Exception");
        for (int i = 0; i < 10; i++) {
            ints[i] = i;
        }
        try {
            int j = ints[11];
        } catch (Exception e) {
            StringWriter trace = new StringWriter();
            e.printStackTrace(new PrintWriter(trace));
            logger.severe(trace.toString());
        }
    }
}
