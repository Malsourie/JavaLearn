package polymorphism.exercises;

class Cycle {
    public void ride() {
        System.out.println("ride a cycle.");
    }

    public int wheels() {
        return 1;
    }
}

class Unicycle extends Cycle {
    @Override
    public void ride() {
        System.out.println("ride a unicycle");
    }

    public void balance() {
        System.out.println("Balance a unicycle.");
    }
}

class Bicycle extends Cycle {
    @Override
    public void ride() {
        System.out.println("ride a bicycle.");
    }

    @Override
    public int wheels() {
        return 2;
    }

    public void balance() {
        System.out.println("Balance a bicycle.");
    }
}

class Tricycle extends Cycle {
    @Override
    public void ride() {
        System.out.println("ride a tricycle.");
    }

    @Override
    public int wheels() {
        return 3;
    }
}

public class Person {
    public static void ride(Cycle c) {
        c.ride();
    }

    public static void main(String[] args) {
        Cycle ui = new Unicycle();
        Cycle bi = new Bicycle();
        Cycle tr = new Tricycle();
        Person.ride(ui);
        Person.ride(bi);
        Person.ride(tr);
        System.out.println(ui.wheels());
        System.out.println(bi.wheels());
        System.out.println(tr.wheels());

        Cycle[] cycles = {new Unicycle(), new Bicycle(), new Tricycle()};
        ((Unicycle)cycles[0]).balance();
        ((Bicycle)cycles[1]).balance();

    }
}


