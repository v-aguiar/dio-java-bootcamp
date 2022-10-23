package dio.v_aguiar.exercises.arrays;

public class Ex1_InvertOrder {
  public static void main(String[] args) {
    int[] vector = { -5, -6, 15, 50, 8, 4 };
    System.out.print("Vector: ");

    for (int element : vector) {
      System.out.print(element + " ");
    }

    System.out.print("\nVector (reverse): ");

    for (int i = vector.length - 1; i >= 0; i--) {
      int element = vector[i];
      System.out.print(element + " ");
    }
  }
}
