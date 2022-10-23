package dio.v_aguiar.exercises.arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os num vetor.
Ao final mostre os números e seus sucessores.
*/
public class Ex3_RandomNumbers {
  public static Map<Integer, Integer> numbersMap = new HashMap<Integer, Integer>();

  public static void main(String[] args) {
    getRandomNumbers();
    printRandomNumbers();
  }

  static void getRandomNumbers() {
    Scanner scan = new Scanner(System.in);
    final int _LIMIT = 5;
    int counter = 0;

    while (counter < _LIMIT) {
      System.out.println("Insert a number between 0 and 100");
      Integer number = scan.nextInt();

      if (number >= 0 && number <= 100) {
        numbersMap.put(number, number + 1);
        counter++;
      } else {
        System.out.println("⚠ Invalid input!");
      }
    }
    scan.close();
  }

  static void printRandomNumbers() {
    for (Integer key : numbersMap.keySet()) {
      System.out.println("Number: " + key + ", Successor: " + numbersMap.get(key));
    }
  }
}
