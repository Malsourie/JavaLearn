package interfaces;

public class StringProcessor {
    public String name() {
        return getClass().getSimpleName();
    }

    public String process(String input) {
        StringBuilder sb = new StringBuilder();
        sb.append(input);
        sb.reverse();
        return sb.toString();
    }

    public static void main(String[] args) {
        StringProcessor sp = new StringProcessor();
        String in = "abc";
        String out = sp.process(in);
        System.out.println(out);
    }
}
