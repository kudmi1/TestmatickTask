abstract class Shape {
  private String color;

  public Shape(String color) {
    this.color = color;
  }

  public abstract double calculateArea();

  public String getColor() {
    return color;
  }
  
  @Override 
  public String toString() {
    String shapeInfo = String.format("Фігура: %s, площа: %.2f кв.од., колір: %s", getShapeName(), calculateArea(), getColor());

    if(this instanceof Square) {
      double sideLength = ((Square) this).getSideLength();
      return shapeInfo + String.format(", довжина сторони: %.2f од.", sideLength);
    }
    else if(this instanceof Triangle) {
      double hypotenuse = ((Triangle) this).getHypotenuse();
      return shapeInfo + String.format(", гіпотенуза: %.2f од.", hypotenuse);
    }
    else if(this instanceof Circle) {
      double radius = ((Circle) this).getRadius();
      return shapeInfo + String.format(", радіус: %.2f од.", radius);
    }

    else if(this instanceof Trapezoid) {
      Trapezoid trapezoid = (Trapezoid) this;
      double base1 = trapezoid.getBase1();
      double base2 = trapezoid.getBase2();
      double height = trapezoid.getHeight();
      return shapeInfo + String.format(", верхня основа: %.2f од. і нижня основа: %.2f од., висота: %.2f од.", base1, base2, height);
    }

    return shapeInfo;
  }
  
  protected abstract String getShapeName();
 
}

class Square extends Shape {
  private double sideLength;

  public Square(String color, double sideLength) {
    super(color);
    this.sideLength = sideLength;
  }

  public double getSideLength() {
    return sideLength;
}

  @Override
  public double calculateArea() {
    return sideLength * sideLength;
  }

  @Override
  protected String getShapeName() {
    return "квадрат";
  }
}

class Triangle extends Shape {
  private double hypotenuse;

  public Triangle(String color, double hypotenuse) {
    super(color);
    this.hypotenuse = hypotenuse;
  }

  public double getHypotenuse() {
    return hypotenuse;
}

  @Override
  public double calculateArea() {
    return 0.5 * Math.pow(hypotenuse, 2);
  }

  @Override
  protected String getShapeName() {
    return "трикутник";
  }  
}

class Circle extends Shape {
  private double radius;

  public Circle(String color, double radius) {
    super(color);
    this.radius = radius;
  }

  public double getRadius() {
    return radius;
}

  @Override
  public double calculateArea() {
    return Math.PI * Math.pow(radius, 2);
  }

  @Override
  protected String getShapeName() {
    return "коло";
  }  
}

class Trapezoid  extends Shape {
  private double base1;
  private double base2;
  private double height;

  public Trapezoid(String color, double base1, double base2, double height) {
    super(color);
      this.base1 = base1;
      this.base2 = base2;
      this.height = height;
  }

  public double getBase1() {
    return base1;
}

  public double getBase2() {
    return base2;
}

  public double getHeight() {
    return height;
}

  @Override
  public double calculateArea() {
    return 0.5 * height * (base1 + base2);
  }

  @Override
  protected String getShapeName() {
    return "трапеція";
  }  
}

