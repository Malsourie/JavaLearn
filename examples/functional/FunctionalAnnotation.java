package functional;

public class FunctionalAnnotation {
    public String goodbye(String arg) {
        return "Goodbye, " + arg;
    }

    public static void main(String[] args) {
        FunctionalAnnotation fa = new FunctionalAnnotation();
        Functional f = fa::goodbye;
        FunctionalNoAnn fna = fa::goodbye;
        Functional f1 = x -> "Goodbye: " + x;
        FunctionalNoAnn fna1 = a -> "Goodbye: " + a;
    }
}

@FunctionalInterface
interface Functional {
    String goodbye(String arg);
}

interface FunctionalNoAnn {
    String goodbye(String arg);
}

//@FunctionalInterface
//interface NotFunctional {
//    String goodbye(String arg);
//    String hello(String arg);
//}
