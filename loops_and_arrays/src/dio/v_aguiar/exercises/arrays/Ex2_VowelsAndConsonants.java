package dio.v_aguiar.exercises.arrays;

import java.util.Arrays;
import java.util.Scanner;

/*
Faça um Programa que leia um vetor de 6 caracteres,
e diga quantas consoantes foram lidas.
Imprima as consoantes.
*/

public class Ex2_VowelsAndConsonants {
  static char[] vowels = { 'a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U' };

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    char[] characters = new char[6];

    for (int i = 0; i < characters.length; i++) {
      System.out.println("Insert one character: ");
      characters[i] = scan.next().charAt(0);
    }

    checkForConsonants(characters);
    scan.close();
  }

  /**
   * <h3>checkForConsonants - method</h3>
   * <br>
   * Receives an array of characters,
   * check for consonants and prints them to the console
   * 
   * @param characters (char[] with length = 6)
   * @return void
   */
  static void checkForConsonants(char[] characters) {
    if (characters.length != 6) {
      System.out.println("A lista deve conter 6 caracteres.");
      return;
    }

    char[] consonants = new char[6];
    int consonantsIndex = 0;

    for (char character : characters) {
      int isVowel = Arrays.binarySearch(vowels, character);
      if (isVowel < 0) {
        consonants[consonantsIndex] = character;
        consonantsIndex++;
      }
    }
    printConsonants(consonantsIndex, consonants);
  }

  static void printConsonants(int consonantsIndex, char[] consonants) {
    System.out.print("\nThere are " + (consonantsIndex > 0 ? consonantsIndex : consonantsIndex) + " consonants!");

    if (consonantsIndex == 0)
      return;

    System.out.print("\nconsonants: ");
    for (char character : consonants) {
      System.out.print(character + " ");
    }
  }
}
