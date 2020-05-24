import java.util.Scanner;

public class L1Pgm05 {

   public static void main(String[] args) {
   
      Scanner ler = new Scanner(System.in);
      String nome, categoria;
      float peso;

      System.out.printf("Informe o nome: ");
      nome = ler.nextLine();
      
      System.out.printf("Informe o primeiro número: ");
      peso = ler.nextFloat();
      
      if( peso < 65.0 )
         categoria = "Pena";
      else if( peso < 72.0 )
         categoria = "Leve";
      else if( peso < 79.0 )
          categoria = "Ligeiro";
      else if( peso < 86.0 )
          categoria = "Meio medio";
      else if( peso < 93.0 )
          categoria = "Medio";
      else if( peso < 100.0 )
          categoria = "Meio pesado";
      else
          categoria = "Pesado";
          
      System.out.println("Nome fornecido: " + nome);
      System.out.println("Peso fornecido: " + peso);
      System.out.println("O lutador " + nome + " pesa " + peso + "Kg e se enquadra na categoria " + categoria);
     
      ler.close();
   }
}