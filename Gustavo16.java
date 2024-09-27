/*
Implemente um programa que receba um número inteiro positivo representando um ano qualquer e imprima se o ano é bissexto ou não. Um ano bissexto é definido quando: (ano % 4 = 0 e (ano % 100 != 0 ou ano % 400 == 0)).
*/
import java.util.Scanner;

public class Gustavo16{
  public static void main(String[]args){
    Scanner teclado = new Scanner(System.in);
    System.out.println("Digite um ano par: ");
    int Ano = teclado.nextInt();

    if ((Ano%4==0) && ((Ano%100!=0) || (Ano%400==0)) ){
      System.out.println("Ano bissexto");
    }
    else{
      System.out.println("Não é bissexto");
    }
  }
}