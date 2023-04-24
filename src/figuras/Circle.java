package figuras;

public class Circle implements IArea {
  double radio = 0.0;

  public Circle(double radio) {
    this.radio = radio;
  }

  @Override
  public double calculateArea() {
    double area = Math.PI * Math.pow(radio, 2);

    return area;
  }

}
