package dio.v_aguiar.poo.interfaces;

public class Calculator implements MathOperations {

  @Override
  public void div(double op1, double op2) {
    double result = op1 / op2;
    System.out.println("Div : " + op1 + " / " + op2 + " = " + result);
  }

  @Override
  public void mult(double op1, double op2) {
    double result = op1 * op2;
    System.out.println("Mult: " + op1 + " * " + op2 + " = " + result);
  }

  @Override
  public void sum(double op1, double op2) {
    double result = op1 + op2;
    System.out.println("Sum : " + op1 + " + " + op2 + " = " + result);
  }

  @Override
  public void sub(double op1, double op2) {
    double result = op1 - op2;
    System.out.println("Sub : " + op1 + " - " + op2 + " = " + result);
  }
}
