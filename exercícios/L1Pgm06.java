import java.util.Scanner;

public class L1Pgm06 {

   public static void main(String[] args) {
   
      Scanner ler = new Scanner(System.in);
      int x;

      do {
         System.out.printf("Informe o número: ");
         x = ler.nextInt();
         if(x > 0)      
            System.out.println(x + " positivio");
         else if(x < 0)
            System.out.println(x + " negativo");
         else {
            System.out.println("Você digitou 0!");
            System.out.println("Fim do programa");
         }
      } while (x != 0);
      
      ler.close();
   }
}