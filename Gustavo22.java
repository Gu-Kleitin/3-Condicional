/*
Cibele, Camila e Celeste são três irmãs inseparáveis. Estão sempre juntas e adoram fazer esportes, ler, cozinhar, jogar no computador... Agora estão aprendendo a programar computadores para desenvolverem seus próprios jogos.
Mas nada disso interessa para esta tarefa: estamos interessados apenas nas suas idades. Sabemos que Cibele nasceu antes de Camila e Celeste nasceu depois de Camila
Dados três números inteiros indicando as idades das irmãs, escreva um programa para determinar a idade de Camila.
Entrada
A entrada é composta por três linhas, cada linha contendo um número inteiro N, a idade de uma das irmãs.
Saída
Seu programa deve produzir uma única linha, contendo um único número inteiro, a idade de Camila.
Restrições
5 ≤ N ≤ 100
*/

import java.util.Scanner;
import java.util.Arrays;

public class Gustavo22{
  public static void main(String[]args){
    Scanner telcado = new Scanner(System.in);
    System.out.println("Digite a idade da primeira irmã: ");
    int Idade1 = telcado.nextInt();
    System.out.println("Digite a idade da segunda irmã: ");
    int Idade2 = telcado.nextInt();
    System.out.println("Digite a idade da terceira irmã: ");
    int Idade3 = telcado.nextInt();

    if (((Idade1<=5) && (Idade2<=5) && (Idade3 <= 5)) || ((Idade1<=100) && (Idade2<=100) && (Idade3 <= 100))){
      Integer vet [] = new Integer[3];
      vet[0] = Idade1;
      vet[1] = Idade2;
      vet[2] = Idade3;

      Arrays.sort(vet);
      System.out.println("A idade de camila é: "+vet[1]);
    }
    else{
      System.out.println("Estou com a impressão de que a mãe dessas irmãs não é um ser humano");
    }
  }
}