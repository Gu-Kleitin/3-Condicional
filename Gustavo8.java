/*
Crie um algoritmo que receba o valor de x, calcule e imprima o valor de f(x).
  */

import java.util.Scanner;

public class Gustavo8{
  public static void main(String[]args){
    Scanner teclado = new Scanner(System.in);
    System.out.println("Digite o valor de x: ");
    float X = teclado.nextFloat();

    if (X <= 1){
      System.out.println("seu f(X) vale 1\n");
    }
    else if(1 < X && X <= 2){
      System.out.println("O seu f(x) vale 2\n");
    }
    else if (2< X && X <= 3){
      double x2 = Math.pow(X,2);
      System.out.format("Seu f(X) vale %.2f\n", x2);
    }
    else{
      double x3 = Math.pow(X,3);
      System.out.format("O valor do seu f(x) é %.2f\n", x3);
    }
  }
}