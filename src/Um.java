import java.util.Scanner;

  public class Um {
      public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          double largura_terreno, comprimento_terreno, metros_quadrados;

          System.out.print("Digite a largura do terreno: ");
          largura_terreno = sc.nextInt(); // Lê um inteiro, que será promovido a double na atribuição

          System.out.print("Digite o comprimento do terreno: ");
          comprimento_terreno = sc.nextInt(); // Lê um inteiro, que será promovido a double na atribuição

          metros_quadrados = (largura_terreno * comprimento_terreno ); // Metros quadrados

          System.out.printf("Metros quadrados", metros_quadrados); // Mostrar o resultado

          sc.close(); // Fecha o Scanner para liberar recursos
      }
  }
