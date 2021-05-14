package exercise;

public class Exercise16 {
    private String[] s = {"aaa", "bb", "c"};
//    private String[] s = new String[]{"aaa", "bb", "c"};
//    no private String[] s; s = {"aaa", "bb", "c"};


    public String[] print() {
        return s;
    }

    public static void main(String[] args) {
        Exercise16 e = new Exercise16();
        for (String s : e.print()) {
            System.out.println(s);
        }
    }
}
