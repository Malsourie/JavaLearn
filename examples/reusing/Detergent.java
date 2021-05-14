//: reusing/Detergent.java
// Inheritance syntax & properties.
//import static net.mindview.util.Print.*;

class Cleanser {
  private String s = "Cleanser";
  public void append(String a) { s += a; }
  public void dilute() { append(" dilute()"); }
  public void apply() { append(" apply()"); }
  public void scrub() { append(" scrub()"); }
  public String toString() { return s; }
  public static void main(String[] args) {
    Cleanser x = new Cleanser();
    x.dilute(); x.apply(); x.scrub();
    System.out.print(x);
  }
}	

public class Detergent {
  private final Cleanser cleanser = new Cleanser();

  // Add methods to the interface:
  public void foam() { append(" foam()"); }
  // Test the new class:
  public static void main(String[] args) {
    Detergent x = new Detergent();
    x.dilute();
    x.apply();
    x.scrub();
    x.foam();
    System.out.print(x);
    System.out.print("Testing base class:");
    Cleanser.main(args);
  }

  public void append(String a) {
    cleanser.append(a);
  }

  public void dilute() {
    cleanser.dilute();
  }

  public void apply() {
    cleanser.apply();
  }

  public void scrub() {
    cleanser.scrub();
  }

  public String toString() {
    return cleanser.toString();
  }


}
 /* Output:
Cleanser dilute() apply() Detergent.scrub() scrub() foam()
Testing base class:
Cleanser dilute() apply() scrub()
*///:~
