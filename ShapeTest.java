import org.junit.Test;
import static org.junit.Assert.*;

public class ShapeTest {
  @Test
  public void testShapeHierarchy() {
    Shape square = new Square("червоний", 5.0);
    Shape triangle = new Triangle("чорний", 12.0);
    Shape circle = new Circle("білий", 2.0);
    Shape trapezoid = new Trapezoid("жовтий", 4.0, 6.0, 7.0);

    assertEquals(25.0, square.calculateArea(), 0.01);
    assertEquals(72.0, triangle.calculateArea(), 0.01);
    assertEquals(Math.PI * 2 * 2, circle.calculateArea(), 0.01);
    assertEquals(35.0, trapezoid.calculateArea(), 0.01);

    assertEquals("Фігура: квадрат, площа: 25,00 кв.од., колір: червоний, довжина сторони: 5,00 од.", square.toString());
    assertEquals("Фігура: трикутник, площа: 72,00 кв.од., колір: чорний, гіпотенуза: 12,00 од.", triangle.toString());
    assertEquals("Фігура: коло, площа: 12,57 кв.од., колір: білий, радіус: 2,00 од.", circle.toString());
    assertEquals("Фігура: трапеція, площа: 35,00 кв.од., колір: жовтий, верхня основа: 4,00 од. і нижня основа: 6,00 од., висота: 7,00 од.", trapezoid.toString());
  }
  
}
