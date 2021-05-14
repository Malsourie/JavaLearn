package polymorphism.exercises;

public class Starship {
    private AlertStatus as = new Safe();

    public void becomeDanger() {
        as = new Danger();
    }

    public void becomeWarning() {
        as = new Warning();
    }

    public void becomeSafe() {
        as = new Safe();
    }

    public void getStatus() {
        as.status();
    }

    public static void main(String[] args) {
        Starship ss = new Starship();
        ss.getStatus();
        ss.becomeWarning();
        ss.getStatus();
        ss.becomeDanger();
        ss.getStatus();
        ss.becomeSafe();
        ss.getStatus();
    }
}

class AlertStatus {
    public void status() {}
}

class Danger extends AlertStatus {
    public void status() {
        System.out.println("Danger!");
    }
}

class Warning extends AlertStatus {
    public void status() {
        System.out.println("Warning!");
    }
}

class Safe extends AlertStatus {
    public void status() {
        System.out.println("Safe.");
    }
}
