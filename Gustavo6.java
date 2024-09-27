/* 
Uma empresa decide dar um aumento de 30% aos funcionários com salário inferior à R$700,00 e 10% aos funcionários com salário superior ou igual a R$700,00. Faça um algoritmo que calcule o reajuste e mostre o novo salário.
*/

import java.util.Scanner;

public class Gustavo6{
  public static void main(String[]args){
    Scanner teclado = new Scanner(System.in);
    System.out.println("Quanto é o seu salário? ");
    double salario = teclado.nextDouble();

    if (salario < 700){
      double reajuste = salario+(salario* 0.3);
      System.out.format("Seu novo salário é de: %.2f\n",reajuste);
    }
    else{
      double reajuste = salario+(salario * 0.1);
      System.out.format("Seu novo salário é de: %.2f\n",reajuste);
    }
  }
}