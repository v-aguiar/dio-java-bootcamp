package dio.v_aguiar.exercises.loops;

import java.util.Scanner;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/

public class Ex4_EvenAndOdd {
  static Scanner scan;

  public static void main(String[] args) {
    scan = new Scanner(System.in);

    int totalAmount;
    int evenAmount = 0;
    int oddAmount = 0;

    while (true) {
      System.out.println("\nQuantos números serão inseridos?");
      totalAmount = scan.nextInt();
      if (totalAmount <= 0)
        System.out.println("\n⚠ Valor inválido, insira um número maior que zero!");
      else
        break;
    }

    for (int i = 0; i < totalAmount; i++) {
      System.out.println("\nInsira um número inteiro:");
      int number = scan.nextInt();

      boolean isEven = (number % 2) == 0;
      if (isEven)
        evenAmount++;
      else
        oddAmount++;
    }

    String evenMessage = evenAmount > 1 ? ("\nForam inseridos " + evenAmount + " números pares")
        : ("\nFoi inserido " + evenAmount + " número par");
    String oddMessage = oddAmount > 1 ? ("\nForam inseridos " + oddAmount + " números ímpares")
        : ("\nFoi inserido " + oddAmount + " número ímpar");

    System.out.println(evenMessage);
    System.out.println(oddMessage);
  }
}
