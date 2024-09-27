/*
Na cidade de Sabará, para transferências de veículos, a SABATRAN cobra uma taxa de 1% para carros fabricados antes de 1990 e uma taxa de 1.5% para os fabricados de 1990 em diante. Essa taxa está incidindo sobre o valor de tabela do carro. Implemente um algoritmo que lê o ano de fabricação e o preço do carro e a seguir calcula e imprime imposto a ser pago.
*/

import java.util.Scanner;

public class Gustavo7{
  public static void main(String[]args){
    Scanner teclado = new Scanner(System.in);
    System.out.println("Qual o ano de fabricação do seu carro? ");
    int ano = teclado.nextInt();
    System.out.println("Qual o valor da tabela do seu carro? ");
    double tabela = teclado.nextDouble();

    if (ano < 1990){
      double precoCarro = tabela*0.01;
      System.out.format("O seu carro vale: %.2f, e foi fabricado em: %d, então o imposto cobrado sobre ele é de: %.2f\n", tabela, ano, precoCarro);
    }
    else{
      double precoCarro = tabela*0.015;
      System.out.format("O seu carro vale: %.2f, e foi fabricado em: %d, então o imposto cobrado sobre ele é de: %.2f\n", tabela, ano, precoCarro);
    }
  }
}