import java.util.Scanner;

public class Gustavo2{
  public static void main(String[]args){
    Scanner teclado = new Scanner(System.in);
    System.out.println("Digite um número: ");
    int Num = teclado.nextInt();

    int div = Num%2;

    if (div == 0){
      System.out.println("Par");
    }
    else{
      System.out.println("Ímpar");
    }
  }
}