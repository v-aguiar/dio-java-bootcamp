package dio.v_aguiar.exercises.arrays;

import java.util.Random;

/*
Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9.
*/
public class Ex4_MultidimensionalArrays {
  public static void main(String[] args) {
    Random random = new Random();

    int[][] matrix = new int[4][4];

    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        matrix[i][j] = random.nextInt(9);
      }
    }

    for (int[] line : matrix) {
      for (int el : line) {
        System.out.print(el + " ");
      }
      System.out.println();
    }
  }
}
