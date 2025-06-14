  import java.util.Scanner;


  public class Quatro {
      public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          double numero_um, numero_dois, soma;
            

            System.out.print("Digite o primeiro numero: ");
            numero_um = sc.nextInt(); // Lê um inteiro, que será promovido a double na atribuição

            System.out.print("Digite o segundo numero: ");
            numero_dois = sc.nextInt(); // Lê um inteiro, que será promovido a double na atribuição

          soma = numero_um + numero_dois; // Soma

          System.out.printf("A soma entre os numeros é de:", soma); // Mostrar o resultado
        
          sc.close(); // Fecha o Scanner para liberar recursos
      }
  }
