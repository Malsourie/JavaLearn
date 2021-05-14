package interfaces.exercise;

interface Cycle {
    void move();

    void stop();
}

interface CycleFactory {
    Cycle getCycle();
}

class Unicycle implements Cycle {
    private Unicycle() {}
    @Override
    public void move() {
        System.out.println("Unicycle moves.");
    }

    @Override
    public void stop() {
        System.out.println("Unicycle stops.");
    }

    public static CycleFactory factory = new CycleFactory() {
        @Override
        public Cycle getCycle() {
            return new Unicycle();
        }
    };
}


class Bicycle implements Cycle {
    private Bicycle() {}
    @Override
    public void move() {
        System.out.println("Bicycle moves");
    }

    @Override
    public void stop() {
        System.out.println("Bicycle stops");
    }

    public static CycleFactory factory = new CycleFactory() {
        @Override
        public Cycle getCycle() {
            return new Bicycle();
        }
    };
}


class Tricycle implements Cycle {
    private Tricycle() {}
    @Override
    public void move() {
        System.out.println("Tricycle moves.");
    }

    @Override
    public void stop() {
        System.out.println("Tricycle stops.");
    }

    public static CycleFactory factory = new CycleFactory() {
        @Override
        public Cycle getCycle() {
            return new Tricycle();
        }
    };
}

public class Ride {
    public static void rideCycle(CycleFactory cf) {
        Cycle c = cf.getCycle();
        c.move();
        c.stop();
    }

    public static void main(String[] args) {
        rideCycle(Unicycle.factory);
        rideCycle(Bicycle.factory);
        rideCycle(Tricycle.factory);
    }
}
