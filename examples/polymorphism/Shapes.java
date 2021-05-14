package polymorphism;//: polymorphism/Shapes.java
// Polymorphism in Java.
import polymorphism.shape.*;

class Oval extends Shape {
  @Override
  public void draw() {
    System.out.println("Oval.draw()");
  }

  @Override
  public void erase() {
    System.out.println("Oval.erase()");
  }
}

public class Shapes {
  private static RandomShapeGenerator gen =
    new RandomShapeGenerator(9);
  public static void main(String[] args) {
    Shape[] s = new Shape[9];
    // Fill up the array with shapes:
    for(int i = 0; i < s.length; i++)
      s[i] = gen.next();
    s[8] = new Oval();
    // Make polymorphic method calls:
    for(Shape shp : s) {
      shp.draw();
      shp.imagine();
    }
  }
} /* Output:
Triangle.draw()
Triangle.draw()
Square.draw()
Triangle.draw()
Square.draw()
Triangle.draw()
Square.draw()
Triangle.draw()
Circle.draw()
*///:~
