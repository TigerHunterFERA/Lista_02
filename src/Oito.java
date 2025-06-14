  import java.util.Scanner;


  public class Oito {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            double distancia_Percorrida, combustível_gasto, consumo_Medio; 

            System.out.print("Digite o valor do raio do dirculo: ");
            distancia_Percorrida = sc.nextInt(); // Lê um inteiro, que será promovido a double na atribuição

            System.out.print("Digite o valor do raio do dirculo: ");
            combustível_gasto = sc.nextInt(); // Lê um inteiro, que será promovido a double na atribuição

            consumo_Medio = (distancia_Percorrida / combustível_gasto); // Area do circulo

            System.out.printf("O consumo medio é", consumo_Medio); // Mostrar o resultado
            sc.close(); // Fecha o Scanner para liberar recursos
      }
  }
