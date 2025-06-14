  import java.util.Scanner;


  public class Seis {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            double raio_Circulo, area; 
            double valor_Pi = 3.14;
                

            System.out.print("Digite o valor do raio do dirculo: ");
            raio_Circulo = sc.nextInt(); // Lê um inteiro, que será promovido a double na atribuição

            area = (raio_Circulo * raio_Circulo)/valor_Pi ; // Area do circulo

            System.out.printf("A area é:", area); // Mostrar o resultado
            sc.close(); // Fecha o Scanner para liberar recursos
      }
  }
