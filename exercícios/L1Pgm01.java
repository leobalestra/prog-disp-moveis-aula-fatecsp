import java.util.Scanner;

public class L1Pgm01 {

   public static void main(String[] args) {
   
      Scanner ler = new Scanner(System.in);
      int n1, n2, r;

      System.out.printf("Informe o primeiro número: ");
      n1 = ler.nextInt();
      
      System.out.printf("Informe o primeiro número: ");
      n2 = ler.nextInt();
      
      r = (n1+n2);
      System.out.println("Resultado: " + r );
      ler.close();
   }
}