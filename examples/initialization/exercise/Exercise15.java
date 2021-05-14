package exercise;

public class Exercise15 {
    private String s;
    {
        s = "abc";
    }

    public void print() {
        System.out.println(s);
    }

    public static void main(String[] args) {
        Exercise15 e = new Exercise15();
        e.print();
    }
}
