import java.util.Scanner;

public class L1Pgm03 {

   public static void main(String[] args) {
   
      Scanner ler = new Scanner(System.in);
      int n1, n2, r;

      System.out.printf("Informe o primeiro n�mero: ");
      n1 = ler.nextInt();
      
      System.out.printf("Informe o primeiro n�mero: ");
      n2 = ler.nextInt();
      
      if(n1 >= 0 && n2 >= 0 || n1 < 0 && n2 < 0) {
         r = (n1+n2);      
         System.out.println("Resultado: " + r );
      }
      else {
         System.out.println("Dados inv�lidos!");
      }
      ler.close();
   }
}