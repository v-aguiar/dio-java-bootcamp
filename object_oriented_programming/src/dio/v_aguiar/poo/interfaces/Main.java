package dio.v_aguiar.poo.interfaces;

public class Main {
  static double op1 = 57;
  static double op2 = 325;
  static Calculator calc = new Calculator();

  public static void main(String[] args) {
    calc.div(op1, op2);
    calc.mult(op1, op2);
    calc.sub(op1, op2);
    calc.sum(op1, op2);
  }
}
