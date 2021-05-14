package exercise;

public class C extends A {
    private B b;

    public C(int i, String s) {
        super(i);
        b = new B(s);
    }

    public static void main(String[] args) {
        C c = new C(2, "bbb");
    }

}

class A {
    A(int i) {
        System.out.println("A constructor");
        System.out.println("i = " + i);
    }
}

class B {
    B(String b) {
        System.out.println("B constructor");
        System.out.println("b: " + b);
    }
}
