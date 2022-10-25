package dio.v_aguiar.sobrecarga;

public class Quadrilatero {
  // quadrado
  static float area(float lado) {
    return lado * lado;
  }

  // retângulo
  static float area(float largura, float altura) {
    return largura * altura;
  }

  // trapézio
  static float area(float baseMaior, float baseMenor, float altura) {
    return ((baseMaior + baseMenor) * altura) / 2;
  }
}
