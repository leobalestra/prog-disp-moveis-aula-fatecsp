import java.util.Scanner;

public class L1Pgm07 {

   public static void main(String[] args) {
   
      Scanner ler = new Scanner(System.in);
      int x, min, max, soma, qtd;
      min = 0;
      max = 0;
      soma = 0;
      qtd = 0;
      x = 1;

      while (x > 0) {
         System.out.printf("Informe o número: ");
         x = ler.nextInt();
         if(x > 0) {
            if(x < min || min == 0)
               min = x;
            if(x > max)
               max = x;
            soma = soma + x;
            qtd ++;
         }
      }
      
      System.out.println("Mínimo: " + min);
      System.out.println("Máximo: " + max);
      System.out.println("Soma: " + soma);
      System.out.println("Quantidade: " + qtd);
      ler.close();
   }
}