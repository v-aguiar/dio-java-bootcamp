package dio.v_aguiar.sobrecarga;

public class Main {
  public static void main(String[] args) {
    System.out.println("Area do quadrado: " + Quadrilatero.area(5));
    System.out.println("Area do retangulo: " + Quadrilatero.area(5, 10));
    System.out.println("Area do trapezio: " + Quadrilatero.area(5, 10, 15));
  }
}
