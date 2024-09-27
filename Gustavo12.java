/*
Faça um programa que recebe de entrada três valores numéricos. Verificar se esses valores podem formar um triângulo. Caso não, informar que não forma um triângulo; caso sim, imprima que tipo de triângulo é formado (escaleno, isósceles ou equilátero).
*/

import java.util.Scanner;
public class Gustavo12{
  public static void main(String[]args){
    Scanner teclado = new Scanner(System.in);
    System.out.println("Digite um valor ");
    float N1 = teclado.nextFloat();
    System.out.println("Digite um valor ");
    float N2 = teclado.nextFloat();
    System.out.println("Digite um valor ");
    float N3 = teclado.nextFloat();

    if ((N1+N2 > N3) || (N1+N3 > N2) || (N2+N3 > N1) ){
      System.out.println("É um triângulo");
      if (N1==N2 && N2==N3){
        System.out.println("Equilátero");
      }
      else if ((N1 == N2) || (N2==N3) || (N3==N1)){
        System.out.println("Isóceles");
      }
      else{
        System.out.println("Escaleno");
      }
    }
    else{
      System.out.println("Não é um triângulo");
    }
  }
}

