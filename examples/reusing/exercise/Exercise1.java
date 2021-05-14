package reusing.exercise;

public class Exercise1 {
    Component c;

    public String toString() {
        if (c == null) {
            c = new Component();
            System.out.println("Component Initialized.");
        }
        return c.toString();
    }

    protected void hello() {
        System.out.println("Hello!");
    }

    public static void main(String[] args) {
        Exercise1 e = new Exercise1();
        System.out.println(e);
    }

}

class Component {
    String s;

    {
        s = "abc";
    }

    @Override
    public String toString() {
        return "Component{" +
                "s='" + s + '\'' +
                '}';
    }
}