package interfaces.exercise;

public class Exercise15 {
    public static void t(InterfaceOne io) { io.method1(); io.method2(); }
    public static void u(InterfaceTwo it) { it.method3(); it.method4(); }
    public static void v(InterfaceThree ith) { ith.method5(); ith.method6(); }
    public static void w(InterfaceTriple itr) {itr.method7();}
    public static void x(Exercise e) { e.method7(); }

    public static void main(String[] args) {
        ExerciseSolid e15 = new ExerciseSolid();
        Exercise15.t(e15);
        Exercise15.u(e15);
        Exercise15.v(e15);
        Exercise15.w(e15);
        Exercise15.x(e15);
    }
}

class ExerciseSolid extends Exercise {
    @Override
    public void method1() {
        System.out.println("method 1");
    }

    @Override
    public void method2() {
        System.out.println("method 2");
    }

    @Override
    public void method3() {
        System.out.println("method 3");
    }

    @Override
    public void method4() {
        System.out.println("method 4");

    }

    @Override
    public void method5() {
        System.out.println("method 5");
    }

    @Override
    public void method6() {
        System.out.println("method 6");
    }
}

abstract class Exercise implements InterfaceTriple {
    @Override
    public void method7() {
        System.out.println("method 7");
    }
}

interface InterfaceOne {
    void method1();
    void method2();
}

interface InterfaceTwo {
    void method3();
    void method4();
}

interface InterfaceThree {
    void method5();
    void method6();
}

interface InterfaceTriple extends InterfaceOne, InterfaceTwo, InterfaceThree {
    void method7();
}

