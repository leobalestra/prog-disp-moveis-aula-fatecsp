import java.util.Scanner;

public class L1Pgm10 {

   public static void main(String[] args) {
   
      Scanner ler = new Scanner(System.in);
      int x;
      //int NEG[50], POS[50]
      int A = [1,6,-9,-7,8,5,25,12,54,74,
               96,-98,-41,-25,0,-8,-100,2,4,3,
               9,-1,-78,26,-200,205,-210,220,50,-99,
               85,300,-320,320,111,-222,-333,444,-555,666,
               987,654,321,123,465,789,147,258,369,-852]

      System.out.printf("Informe um número de 0 a 50: ");
      x = ler.nextInt();

      
      if(min > max){
         System.out.println("Mínimo e máximo invertidos");
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
               System.out.println("Valor fora do intervalo ["+min+","+max+"] ignorado na totalização");
         }
      }
      
      if(posicao == tam)
         System.out.println("Tamnaho do vetor chegou a 10");
      
      System.out.println("Mínimo: " + min);
      System.out.println("Máximo: " + max);
      System.out.println("Soma: " + soma);
      System.out.println("Quantidade: " + qtd);
      System.out.print("Números digitados: ");
      int i;
      for( i = 0; i < posicao; i++ ) {
         System.out.print(num[i]+" | ");
      }
      ler.close();
   }
}