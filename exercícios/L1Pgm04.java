import java.util.Scanner;

public class L1Pgm04 {

   public static void main(String[] args) {
   
      Scanner ler = new Scanner(System.in);
      int n1, n2, n3;
      String r;

      System.out.printf("Informe o primeiro número: ");
      n1 = ler.nextInt();
      
      System.out.printf("Informe o primeiro número: ");
      n2 = ler.nextInt();
      
      System.out.printf("Informe o terceiro número: ");
      n3 = ler.nextInt();
      
      //if( n1 + n2 > n3 &&
      //    n1 + n3 > n2 &&
      //    n3 + n2 > n1 )
      
      if( ( n1 <= n3 && n2 <= n3 && (n1+n2) > n3 ) ||
          ( n3 <= n1 && n2 <= n1 && (n3+n2) > n1 ) ||
          ( n3 <= n2 && n1 <= n2 && (n1+n3) > n2 ) ) {
      
          if(n1 == n2 && n1 == n3) {
            r = "Equilátero";
          }
          else if(n1 == n2 && n1 != n3 || n1 == n3 && n1 != n2 || n2 == n3 && n2 != n1) {
            r = "Isósceles";
          }
          else {
            r = "Escaleno";
          }
          
          System.out.println("Triângulo: " + r );
      }
      else {
         System.out.println("Não é um triangulo!");
      }
      ler.close();
   }
}