import java.util.ArrayList;
import java.util.List;
import java.util.Random;



public class ShapeGenerator {
  public static void main(String[] args) {
    List<Shape> shapes = generateRandomShapes(35);
    printShapes(shapes);
  }

  private static List<Shape> generateRandomShapes(int numberOfShapes) {
    List<Shape> shapes = new ArrayList<>();
    Random random = new Random();

    for (int i = 0; i < numberOfShapes; i++) {
      String color = generateRandomColor();
      int shapeType = random.nextInt(4);

      switch(shapeType) {
        case 0: 
          double sideLength = random.nextDouble() * 10 + 1;
          shapes.add(new Square(color, sideLength));
          break;
        case 1: 
          double hypotenuse = random.nextDouble() * 10 + 1;
          shapes.add(new Triangle(color, hypotenuse));
          break;
        case 2: 
          double radius = random.nextDouble() * 5 + 1;
          shapes.add(new Circle(color, radius));
          break;
        case 3: 
          double base1 = random.nextDouble() * 10 + 1;
          double base2 = random.nextDouble() * 10 + 1;
          double height = random.nextDouble() * 10 + 1;
          shapes.add(new Trapezoid(color, base1, base2, height));
          break;
      }
    }
    return shapes;
  }

  private static String generateRandomColor() {
    String[] colors = {"синій", "жовтий", "червоний", "зелений", "помаранчевий", "блакитний", "коричневий", "білий", "чорный"};
    Random random = new Random();
    int index = random.nextInt(colors.length);
    return colors[index];
  }

  private static void printShapes(List<Shape> shapes) {
    for (Shape shape : shapes) {
      System.out.println(shape);
    }

  }
}
