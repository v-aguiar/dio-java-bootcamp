package dio.v_aguiar.exercises.loops;

import java.util.Scanner;

/*
Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido
e continue pedindo
até que o usuário informe um valor válido.
*/

public class Ex2_Grade {
  static Scanner scan;

  public static void main(String[] args) {
    scan = new Scanner(System.in);

    int grade;

    while (true) {
      System.out.println("\nInsira uma nota de 0 a 10: ");
      grade = scan.nextInt();

      boolean outOfRange = grade > 10 || grade < 0;
      if (outOfRange)
        System.out.println("\n⚠ Nota inválida!");
      else
        break;
    }

    System.out.println("\nA note é: " + grade);
  }
}
