package exceptions.exercise;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

public class Exercise6 {
    public static void main(String[] args) {
        try {
            throw new LoggingException1();
        } catch (Exception e) {
            System.err.println("Caught e1");
        }
        try {
            throw new LoggingException2();
        } catch (Exception e) {
            System.err.println("Caught e2");
        }
    }
}

class LoggingException1 extends Exception {
    private static Logger logger = Logger.getLogger("LoggingExcpetion1");
    public LoggingException1() {
        StringWriter trace = new StringWriter();
        this.printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}

class LoggingException2 extends Exception {
    private static Logger logger = Logger.getLogger("LoggingException2");
    public LoggingException2() {
        StringWriter trace = new StringWriter();
        this.printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}
