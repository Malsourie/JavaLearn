package exercise;

public class Dog {
    private String name;
    private String says;

    public Dog(String name, String says) {
        this.name = name;
        this.says = says;
    }

    public String getName() {
        return name;
    }

    public String getSays() {
        return says;
    }

    public static void main(String[] args) {
        Dog spot = new Dog("spot", "Ruff!");
        Dog scruffy = new Dog("scruffy", "Wurf!");

        System.out.println("First dog: " + spot.getName() + " says " + spot.getSays());
        System.out.println("Second dog: " + scruffy.getName() + " says " + scruffy.getSays());

        Dog spot2 = new Dog("spot", "Ruff!");
        System.out.println(spot == spot2);
        System.out.println(spot.equals(spot2));
    }

}
