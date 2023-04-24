package figuras;

public class Triangle implements IArea {
  protected double b;
  protected double h;

  public Triangle(double b, double h) {
    this.b = b;
    this.h = h;
  }


  @Override
  public double calculateArea() {
    double area = (b * h) / 2;

    return area;
  };

}