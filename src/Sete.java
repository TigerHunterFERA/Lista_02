  import java.util.Scanner;


  public class Sete {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            double valor_Hora, hora_Trabalhadas, pagamento; 
            String nome;

            System.out.print("Digite o valor do raio do dirculo: ");
            nome = sc.nextLine(); // Lê um inteiro, que será promovido a double na atribuição

            System.out.print("Digite o valor do raio do dirculo: ");
            valor_Hora = sc.nextInt(); // Lê um inteiro, que será promovido a double na atribuição

            System.out.print("Digite o valor do raio do dirculo: ");
            hora_Trabalhadas = sc.nextInt(); // Lê um inteiro, que será promovido a double na atribuição

            pagamento = (valor_Hora * hora_Trabalhadas); // Area do circulo

            System.out.printf("O pagamento de", nome, " deve ser de:", pagamento); // Mostrar o resultado
            sc.close(); // Fecha o Scanner para liberar recursos
      }
  }