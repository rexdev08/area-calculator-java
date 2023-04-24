package figuras;

public class Square implements IArea {
  protected double l;

  public Square(double l) {
    this.l = l;
  }

  @Override
  public double calculateArea() {
    double area = 0.0;
    try {
      area = Math.pow(l, (double) 2);

    } catch (Exception e) {

    }
    return area;

  }

}
