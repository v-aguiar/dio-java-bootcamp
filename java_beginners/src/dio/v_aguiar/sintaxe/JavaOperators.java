package dio.v_aguiar.sintaxe;

public class JavaOperators {
  public static void main(String[] args) {
    String nome = "Devinho"; // strings usam aspas duplas
    char firstLetter = 'A'; // chars usam aspas simples

    // Java concat
    String concat = "?"; // ?

    concat = 1 + 1 + 1 + "1"; // 31

    concat = 1 + "1" + 1; // 111

    concat = 1 + "1" + (1 + 1 + 1); // 113

    System.out.println("concat: " + concat);

    // Java comparison operators (objects)

    String name1 = "Ieie";
    String name2 = "Ieie";

    System.out.println(name1 == name2); // true

    name2 = new String("Ieie");

    System.out.println(name1 == name2); // false
    System.out.println(name1.equals(name2)); // true -> To an accurate object comparison, the method equals is used
  }
}
