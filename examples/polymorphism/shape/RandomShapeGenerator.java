//: polymorphism/shape/RandomShapeGenerator.java
// A "factory" that randomly creates shapes.
package polymorphism.shape;
import java.util.*;

public class RandomShapeGenerator implements Iterable<Shape>{
  private final Random rand = new Random(47);
  private final int num;
  public RandomShapeGenerator(int i) {
    num = i;
  }
  public Shape next() {
    return switch(rand.nextInt(3)) {
      default -> new Circle();
      case 1 -> new Square();
      case 2 -> new Triangle();
    };
  }

  @Override
  public Iterator<Shape> iterator() {
    return new Iterator<>() {
      private int counter;

      @Override
      public boolean hasNext() {
        return counter < num;
      }

      @Override
      public Shape next() {
        counter++;
        return switch (rand.nextInt(3)) {
          default -> new Circle();
          case 1 -> new Square();
          case 2 -> new Triangle();
        };
      }
    };
  }

  public static void main(String[] args) {
    RandomShapeGenerator gen = new RandomShapeGenerator(9);
    for (Shape s : gen) {
        s.draw();
        s.imagine();
    }
  }
} ///:~
