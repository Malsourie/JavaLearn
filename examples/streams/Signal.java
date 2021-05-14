package streams;

import java.util.Optional;
import java.util.Random;
import java.util.stream.Stream;

public class Signal {
    private final String msg;
    public Signal(String msg) {
        this.msg = msg;
    }
    public String getMsg() {
        return msg;
    }
    @Override
    public String toString() {
        return "Signal(" + msg +")";
    }
    static Random rand = new Random(415);
    public static Signal morse() {
        return switch (rand.nextInt(4)) {
            case 1 -> new Signal("dot");
            case 2 -> new Signal("dash");
            default -> null;
        };
    }
    public static Stream<Optional<Signal>> stream() {
        return Stream.generate(Signal::morse).map(Optional::ofNullable);
    }
}
