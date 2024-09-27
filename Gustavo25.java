/*
O móbile na sala da Maria é composto de três hastes exatamente como na figura abaixo. Para que ele esteja completamente equilibrado, com todas as hastes na horizontal, os pesos das quatro bolas A, B, C e D têm que satisfazer todas as seguintes três condições:

A = B + C + D; e
B + C = D; e
B = C

Nesta tarefa, dados os pesos das quatro bolas, seu programa deve decidir se o móbile está ou não completamente equilibrado.

Entrada
A entrada consiste de quatro linhas contendo, cada uma, um número inteiro, indicando os pesos das bolas. Os números são dados na ordem: A, B, C e D.
Saída
Seu programa deve escrever uma única linha na saída, contendo o caractere "S" se o móbile estiver equilibrado, ou o caractere "N" se não estiver equilibrado.
Restrições
1 ≤ A,B,C,D ≤ 1000
*/

import java.util.Scanner;
public class Gustavo25{
  public static void main(String[]args){
    Scanner teclado = new Scanner(System.in);
    System.out.println("Digite o peso da bola A: ");
    int A = teclado.nextInt();
    System.out.println("Digite o peso da bola B: ");
    int B = teclado.nextInt();
    System.out.println("Digite o peso da bola C: ");
    int C = teclado.nextInt();
    System.out.println("Digite o peso da bola D: ");
    int D = teclado.nextInt();

    if ((A>=1 && B>= 1 && C>= 1 && D>= 1) && (A<=1000 && B<=1000 && C<=1000 && D<=1000)){
      if ((A == B + C + D) && (B + C == D) && (B == C)){
        System.out.println("S");
      }
      else{
        System.out.println("N");
      }
    }
    else{
      System.out.println("Tu quer colocar um número negativo ou maior que 1000?\nAqui não chefia");
    }
  }
}