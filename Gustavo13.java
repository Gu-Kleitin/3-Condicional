/*abstractImplemente um programa que receba um número inteiro de 3 dígitos de entrada. Após isso, verifique se o mesmo é palíndromo, ou seja, é o mesmo número lido da direita para esquerda ou vice-versa. Ex.: 121, 353, etc.
*/

import java.util.Scanner;

public class Gustavo13{
  public static void main (String[]args){
    Scanner teclado = new Scanner (System.in);
    System.out.println("Digite um numero ");
    String Num1 = teclado.next();
    String NumIN = new StringBuilder(Num1).reverse().toString();
    int Num2 = Integer.parseInt(Num1);
    int NumIN2 = Integer.parseInt(NumIN);

    System.out.println(NumIN2==Num2?"É um palíndromo":"Não é um palíndromo");
  }
}