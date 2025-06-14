  import java.util.Scanner;


  public class Cinco {
      public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          double preco_Produto, quantidade_Comprada, dinheiro_Recebido, troco;
            

            System.out.print("Digite o preço do produto: ");
            preco_Produto = sc.nextInt(); // Lê um inteiro, que será promovido a double na atribuição

            System.out.print("Digite a quantidade comprada: ");
            quantidade_Comprada = sc.nextInt(); // Lê um inteiro, que será promovido a double na atribuição

            System.out.print("Digite o dinheiro recebido: ");
            dinheiro_Recebido = sc.nextInt(); // Lê um inteiro, que será promovido a double na atribuição

          troco = dinheiro_Recebido - preco_Produto * quantidade_Comprada ; // Soma

          System.out.printf("O troco será de:", troco, " reais"); 
        
          sc.close(); // Fecha o Scanner para liberar recursos
      }
  }
