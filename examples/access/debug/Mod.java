package debug;


public class Mod {
    public void debug(String[] args) {
        for (String arg : args) {
            System.out.print(arg + " ");
        }
        System.out.println();
    }
}
