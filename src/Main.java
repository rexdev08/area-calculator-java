import figuras.*;

public class Main {

  public static void main(String[] args) {
    Square sq = new Square(20);
    Circle cir = new Circle(20);
    Triangle tr = new Triangle(20, 70);

    printArea(sq);
    printArea(cir);
    printArea(tr);

  }

  public static void printArea(IArea fig) {

    System.out.println("Area de " + fig.getClass().getSimpleName() + " es: " + fig.calculateArea());
  }
}
