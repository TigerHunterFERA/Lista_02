  import java.util.Scanner;


  public class Três {
      public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          double idade_um, idade_dois, media;
          String nome_um, nome_dois;
                 
            System.out.print("Dados da primeira pessoa ");
            System.out.print("Digite o nome da pessoa: ");
            nome_um = sc.nextLine(); // Lê um inteiro, que será promovido a double na atribuição

            System.out.print("Digite a idade da pessoa: ");
            idade_um = sc.nextInt(); // Lê um inteiro, que será promovido a double na atribuição

            System.out.print("Dados da segunda pessoa ");
            System.out.print("Digite o nome da pessoa: ");
            nome_dois = sc.nextLine(); // Lê um inteiro, que será promovido a double na atribuição

            System.out.print("Digite a idade da pessoa: ");
            idade_dois = sc.nextInt(); // Lê um inteiro, que será promovido a double na atribuição


          media = (idade_um + idade_dois)/2; // Media

          System.out.printf("A media de idade entre:", nome_um, " e", nome_dois, "é de", media, "anos:"); // Mostrar o resultado
        
          sc.close(); // Fecha o Scanner para liberar recursos
      }
  }