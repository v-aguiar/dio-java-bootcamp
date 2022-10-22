package dio.v_aguiar.exercises.loops;

import java.util.Scanner;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
(do-while)
*/

public class Ex3_GreatestAndAverage {
  static Scanner scan;

  public static void main(String[] args) {
    scan = new Scanner(System.in);

    int counter = 0;
    int greatestNumber = -999999999;
    int sum = 0;
    int number;

    do {
      System.out.println("\nInsira um número inteiro: ");
      number = scan.nextInt();
      greatestNumber = greatestNumber > number ? greatestNumber : number;
      sum += number;
      counter++;
    } while (counter < 5);

    float average = sum / 5;
    System.out.println("\nAverage: " + average);
    System.out.println("\nThe greatest number was: " + greatestNumber);
  }
}
