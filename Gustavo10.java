/*
Elabore um programa que calcule e exiba a tensão S de uma barra cilíndrica de diâmetro D submetida a uma carga Q. Os valores de D e Q devem ser fornecidos pelo usuário do programa via teclado. Utilize a fórmula. onde, n = 2 para D > 100; n = 6 para D < 50 e; n = 4 para outros valores de D.
  */

import java.util.Scanner;

public class Gustavo10{
  public static void main(String[]args){
    Scanner teclado = new Scanner(System.in);
    System.out.println("Vamos calcular a tensão em uma barra cilindrica");
    System.out.println("Preciso que me informe o diâmetro da barra: ");
    float D = teclado.nextFloat();

    System.out.println("Agora digite o valor da carga: ");
    float Q = teclado.nextFloat();

    if (D > 100){
      int N = 2;
      double S = ((4*Q)/(3.14*(Math.pow(D,2))))*N;
      System.out.printf("O valor de tensão na barra é %.2f\n",S);
    }
    else if (D < 50){
      int N = 6;
      double S = ((4*Q)/(3.14*(Math.pow(D,2))))*N;
      System.out.printf("O valor de tensão na barra é %.2f\n",S);
    }
    else{
      int N = 4;
      double S = ((4*Q)/(3.14*(Math.pow(D,2))))*N;
      System.out.printf("O valor de tensão na barra é %.2f\n",S);
    }
  }
}
