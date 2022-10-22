package dio.v_aguiar.sintaxe;

public class Methods {
  // In Java, every method must exist inside of a class, no global methods are
  // allowed

  public double sum(int firstNumber, int secondNumber) { // must return a value of type double
    return firstNumber + secondNumber; // return is mandatory
  }

  public void print(String text) { // função doesn't return anything
    System.out.println(text);
    // no return is needed
  }

  // throws Exception -> used to tell if a method can possibly return an exception
  public double divide(int firstNumber, int secondNumber) throws Exception {
    return firstNumber / secondNumber;
  }

}
