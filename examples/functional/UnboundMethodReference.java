package functional;

public class UnboundMethodReference {
    public static void main(String[] args) {
//        MakeString ms = X::f;
        TransformX sp = X::f;
        X x = new X();
        System.out.println(sp.transform(x));
        System.out.println(x.f());
    }
}

class X {
    String f() {
        return "X::f()";
    }
}

interface TransformX{
    String transform(X x);
}

interface MakeString{
    String make();
}
