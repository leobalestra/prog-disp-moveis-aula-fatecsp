import java.util.Scanner;

public class L1Pgm09 {

   public static void main(String[] args) {
   
      Scanner ler = new Scanner(System.in);
      int x, min, max, qtd, soma, y, posicao, tam;
      tam = 10;
      int num[] = new int[tam];
      posicao = 0;
      qtd = 0;
      soma = 0;
      x = -1;
      System.out.printf("Informe o m�nimo: ");
      min = ler.nextInt();
      System.out.printf("Informe o m�ximo: ");
      max = ler.nextInt();
      
      if(min > max){
         System.out.println("M�nimo e m�ximo invertidos");
         y = min;
         min = max;
         max = y;
      }
      
      while (x != 0 && posicao < tam) {
         System.out.printf("Informe o numero: ");
         x = ler.nextInt();
         if(x != 0) {
            if(x >= min && x <= max ){
               soma = soma + x;
               qtd ++;
               num[posicao] = x;
               posicao ++;
            }
            else
               System.out.println("Valor fora do intervalo ["+min+","+max+"] ignorado na totaliza��o");
         }
      }
      
      if(posicao == tam)
         System.out.println("Tamnaho do vetor chegou a 10");
      
      System.out.println("M�nimo: " + min);
      System.out.println("M�ximo: " + max);
      System.out.println("Soma: " + soma);
      System.out.println("Quantidade: " + qtd);
      System.out.print("N�meros digitados: ");
      int i;
      for( i = 0; i < posicao; i++ ) {
         System.out.print(num[i]+" | ");
      }
      ler.close();
   }
}