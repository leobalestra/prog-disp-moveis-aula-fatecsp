public class POO {

  public static void main(String[] arqs) {
    FormaComCantos forma;

    forma = new Retangulo(3, 6);
    System.out.println("Area do "+ forma.getNome() + " = " + forma.calcArea());
    forma = new Triangulo(3, 6);
    System.out.println("Area do "+ forma.getNome() + " = " + forma.calcArea());
    forma = new Trapezio(1, 3, 6);
    System.out.println("Area do "+ forma.getNome() + " = " + forma.calcArea());
    forma = new Quadrado(3);
    System.out.println("Area do "+ forma.getNome() + " = " + forma.calcArea());

    System.out.println("Fim do Programa");
  }
  
}





