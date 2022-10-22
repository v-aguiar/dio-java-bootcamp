import java.util.Locale;
import java.util.Scanner;

public class aboutWithScanner {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Qual o seu nome?");
    String name = scanner.next();

    System.out.println("Qual o seu sobrenome?");
    String lastName = scanner.next();

    System.out.println("Qual a sua idade?");
    int age = scanner.nextInt();

    System.out.println("Qual a sua altura?");
    double height = scanner.nextDouble();

    scanner.close();

    System.out.println("My name is " + name + " " + lastName);
    System.out.println("I'm " + age + " years old");
    System.out.println("My height is about " + height + " m");
  }
}
