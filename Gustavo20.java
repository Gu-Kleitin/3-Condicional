/*
20. Faça um algoritmo que receba de entrada a altura e o sexo de uma pessoa ('M' - Masculino ou 'F' -
Feminino), construa um algoritmo que calcule o peso ideal da pessoa de acordo com as regras:
- Homens: (72.7*altura) - 58 - Mulher: (62,1*altura) - 44.7
*/

import java.util.Scanner;

public class Gustavo20{
  public static void main(String[]args){
    Scanner teclado = new Scanner(System.in);

    System.out.println("Digite seu sexo(M/F)ou(m/f): ");
    String Sexo = teclado.next();

    if ((Sexo.equals("M")) || (Sexo.equals("m"))){
      System.out.println("Digite sua altura(1.11): ");
      Double Altura = teclado.nextDouble();
      Double Ideal = (72.7 * Altura) - 58;
      System.out.format("Seu peso ideal tem que ser %.1f", Ideal);
      System.out.println();
    }
    else if((Sexo.equals("F")) || (Sexo.equals("f"))){
      System.out.println("Digite sua altura(1.11): ");
      Double Altura = teclado.nextDouble();
      Double Ideal = (62.1 * Altura)-44.7;
      System.out.format("Seu peso ideal tem que ser %.1f", Ideal);
      System.out.println();
    }
    else{
      System.out.println("Tem que digitar ou 'M', ou 'm', ou 'F', ou 'f' chapa, se não fizer isso, iremos nos ver até tu fazer direito");
    }
  }
}