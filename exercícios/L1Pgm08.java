import java.util.Scanner;

public class L1Pgm08 {

   public static void main(String[] args) {
   
      Scanner ler = new Scanner(System.in);
      int x, min, max, qtd, soma, y;
      qtd = 0;
      soma = 0;
      x = -1;
      System.out.printf("Informe o mínimo: ");
      min = ler.nextInt();
      System.out.printf("Informe o máximo: ");
      max = ler.nextInt();
      
      if(min > max){
         System.out.println("Mínimo e máximo invertidos");
         y = min;
         min = max;
         max = y;
      }
      
      while (x != 0) {
         System.out.printf("Informe o numero: ");
         x = ler.nextInt();
         if(x != 0) {
            if(x >= min && x <= max){
               soma = soma + x;
               qtd ++;            
            }
            else
               System.out.println("Valor fora do intervalo ["+min+","+max+"] ignorado na totalização");
         }
      }
      
      System.out.println("Mínimo: " + min);
      System.out.println("Máximo: " + max);
      System.out.println("Soma: " + soma);
      System.out.println("Quantidade: " + qtd);
      ler.close();
   }
}