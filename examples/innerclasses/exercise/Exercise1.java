package innerclasses.exercise;

public class Exercise1 {
    public static void main(String[] args) {
        Outer o = new Outer("Ji Qingyun");
//        Outer.Inner oi = o.inners();
        Outer.Inner oi = o.new Inner();
        o.out();
        oi.in();
        System.out.println(oi);
    }
}

class Outer {
    private String s;
    public Outer(String s) {
        this.s = s;
    }

    class Inner {
        void in() {
            System.out.println("Inner Class.");
        }

        @Override
        public String toString() {
            return s;
        }
    }

    Inner inners() {
        return new Inner();
    }

    void out() {
        System.out.println("Outer Class.");
    }
}