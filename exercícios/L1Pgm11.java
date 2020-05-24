import java.util.Scanner;
import java.util.Random;

public class L1Pgm11 {

   public static void main(String[] args) {
   
      int[] v;
      int i, n, x;
      
      Scanner ler;
      ler = new Scanner(System.in);
      Random gerador = new Random();
      n = leInteiro(1, 50);
   
      v = new int[n];
      
      for(i = 0; i < n; i++)
         v[i] = gerador.nextInt(50);
      
      exibeVetor(v, n);
     
      do {
         System.out.println("\nDigite um numero X para ser encontrado no Vetor: ");
         x = ler.nextInt();
         if (procuraX(v, n, x) == 0)
            System.out.println(x + " não está no vetor!");
      } while (x != 0);
   }
   
   public static int leInteiro(int limMin, int limMax) {
      int a;
      Scanner ler;
      ler = new Scanner(System.in);
      
      do {
         System.out.println("Digite N (entre " + limMin + " e " + limMax +"): ");
         a = ler.nextInt();
      } while (a < limMin || a > limMax);
      
      return(a);      
   }
   
   public static int procuraX(int[] pV, int tam, int pX) {
      int i, flag = 0;
      
      for(i = 0; i < tam; i++)
         if(pV[i] == pX) {
            System.out.println(pX +" localizado em " + i);
            flag = 1;
         }
      
      return flag;
   
   }
   
   public static void exibeVetor(int[] pV, int tam) {
      int i;

      System.out.println("Exibição do Vetor");
      for(i = 0; i < tam; i++)
         System.out.print(pV[i]+", ");
   }
}