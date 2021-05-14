package innerclasses.exercise;

interface Hello {
    void SayHello();
}


public class Exercise9 {

    public Hello getHello() {
        return new Hello() {
            public void SayHello() {
                System.out.println("Hello world!");
            }
        };
    }

    public static void main(String[] args) {
        Exercise9 e9 = new Exercise9();
        Hello h = e9.getHello();
        h.SayHello();
    }
}
