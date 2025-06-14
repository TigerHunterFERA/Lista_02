  import java.util.Scanner;
  import java.lang.Math;

  public class Dois {
      public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          double base_retangulo, altura_retangulo, area, perimetro, diagonal;

          System.out.print("Digite a base do retangulo: ");
          base_retangulo = sc.nextInt(); // Lê um inteiro, que será promovido a double na atribuição

          System.out.print("Digite a altura do retangulo: ");
          altura_retangulo = sc.nextInt(); // Lê um inteiro, que será promovido a double na atribuição

          area = (base_retangulo * altura_retangulo); // Area
          perimetro = ((base_retangulo * 2) + (altura_retangulo * 2)); // Perimetro
          diagonal = Math.sqrt((base_retangulo * base_retangulo) + (altura_retangulo * altura_retangulo)); // Diagonal

          System.out.printf("Area:", area); // Mostrar o resultado
          System.out.printf("Perimetro:", perimetro); // Mostrar o resultado
          System.out.printf("Diagonal:", diagonal); // Mostrar o resultado


          sc.close(); // Fecha o Scanner para liberar recursos
      }
  }