package dio.v_aguiar.sintaxe;

/**
 * <h1>Calculator</h1>
 * Calculates basic math operations betewen int numbers
 * <br>
 * <b>Note: <b> Read this docs carefully to understand all this class resources
 * 
 * @author Victor Aguiar
 * @version 1.0
 * @since 21/10/2022
 */
public class DocsCalculator {
  /**
   * Method used to sum two integer numbers
   * 
   * @param firstNumber
   * @param secondNumber
   * @return int -> returns the sum of the given numbers
   */
  public int sum(int firstNumber, int secondNumber) {
    return firstNumber + secondNumber;
  }

  public static void main(String[] args) {
    final DocsCalculator calc = new DocsCalculator();

    System.out.println("Sum: " + calc.sum(558, 1325));
  }
}
