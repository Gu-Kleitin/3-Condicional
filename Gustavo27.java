/*
A natação foi um dos esportes mais emocionantes das Olimpíadas do Rio. Houve até uma prova na qual três atletas chegaram empatados, cada um recebendo uma medalha de prata! Normalmente, porém, os três primeiros colocados terminam a prova em tempos distintos e, portanto, temos a distribuição mais comum de medalhas: o nadador que terminou no menor tempo recebe medalha de ouro; o nadador que terminou com o segundo menor tempo recebe medalha de prata; e o que terminou com o terceiro menor tempo recebe medalha de bronze. Neste problema, dados os três tempos distintos de finalização da prova, dos três nadadores que ganharam medalhas, seu programa deve dizer quem ganhou medalha de ouro, quem ganhou prata e quem ganhou bronze.

Entrada
A primeira linha da entrada contém um inteiro T1 indicando o tempo que o nadados 1 terminou a prova, T2 indicando o tempo que o nadador 2 terminou a prova e T3 indicando o tempo que o nadador 3 terminou a prova.

Saída
Seu programa deve imprimir três linhas na saída. A primeira linha deve conter o número do nadador que ganhou medalha de ouro; a segunda linha, o número do nadador que ganhou prata; e a terceira linha, o número do nadador que levou bronze.

Restrições
Os tempos T1, T2 e T3 são inteiros entre 1 e 10000.
*/

import java.util.Scanner;
import java.util.Arrays;

public class Gustavo27{
  public static void main(String[]args){
    Scanner telcado = new Scanner(System.in);
    System.out.println("Digite o tempo do nadador 1: ");
    int T1 = telcado.nextInt();
    System.out.println("Digite o tempo do nadador 2: ");
    int T2 = telcado.nextInt();
    System.out.println("Digite o tempo do nadador 3: ");
    int T3 = telcado.nextInt();

    int vet[] = new int[3];
    vet[0] = T1;
    vet[1] = T2;
    vet[2] = T3;
    Arrays.sort(vet);
    
    if ((vet[0]<=10000) && (vet[1]<=10000) && (vet[2]<=10000) && (vet[0]>=1) && (vet[1]>=1) && (vet[2]>=1)){
      
      if((vet[0] == vet[1]) || (vet[1] == vet[2])){
        System.out.println("Teve um empate, os nadadores precisam nadar novamente, até que obtenham tempos diferentes");
      }
      else{
        System.out.println("O nadador que ganhou bronze é: "+vet[2]);
        System.out.println("...");
        System.out.println();
        System.out.println("O nadador que ganhou prata é: "+vet[1]);
        System.out.println("...");
        System.out.println();
        System.out.println("O nadador que ganhou o ouro é: "+vet[0]);
      }
    }
    else{
      System.out.println("Os tempos ultrapassaram o limite permitido");
    }
  }
}