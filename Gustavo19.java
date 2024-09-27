/*
19. Faça um programa que recebe de entrada o código de um produto e a quantidade comprada do mesmo.
Calcule e mostre:
a) O preço unitário do produto, segundo Tabela I
b) Preço total da nota
c) O valor do desconto, segundo Tabela II, aplicado sobre o valor total da nota
d) Preço final ao consumidor após desconto
e) Não se esqueça de verificar a existência do produto
  Código Valor unitário
  1 a 10: R$10,00
  11 a 20: R$20,00
  21 a 30: R$30,00
  31 a 40: R$40,00

  Total da nota % Desconto
  Até R$ 250: 5%
  Entre R$250 e R$500: 10%
  Acima de R$500: 15%
*/


import java.util.Scanner;

public class Gustavo19 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    
    System.out.print("Digite o código do produto: ");
    int codigo = teclado.nextInt();

    double precoUnitario = 0;

    if (codigo >= 1 && codigo <= 10) {
      precoUnitario = 10.00;
    }
     else if (codigo >= 11 && codigo <= 20) {
      precoUnitario = 20.00;
    } 
    else if (codigo >= 21 && codigo <= 30) {
      precoUnitario = 30.00;
    }
    else if (codigo >= 31 && codigo <= 40) {
      precoUnitario = 40.00;
    }
    else {
      System.out.println("Código inválido.");
      return;
    }
    System.out.print("Digite a quantidade comprada: ");
    int quantidade = teclado.nextInt();

    double precoTotal = precoUnitario * quantidade;
    double desconto = 0;

    if (precoTotal <= 250) {
      desconto = precoTotal * 0.05;
    }
    else if (precoTotal > 250 && precoTotal <= 500) {
      desconto = precoTotal * 0.10;
    }
    else if (precoTotal > 500) {
      desconto = precoTotal * 0.15;
    }

    double precoFinal = precoTotal - desconto;

    System.out.println();
    System.out.println("Recibo:");
    System.out.println("Preço unitário: R$" + precoUnitario);
    System.out.println("Preço total: R$" + precoTotal);
    System.out.println("Desconto: R$" + desconto);
    System.out.println("Preço final: R$" + precoFinal);
    System.out.println("Volte sempre! :)");
    System.out.println();
  }
}
