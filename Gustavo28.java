/*
Um novo game de realidade aumentada tem, dentro dele, um mini-game que aparece em certas situações para aumentar o ganho de pontos do game principal. O mini-game é um joguinho de memória com quatro cartas, formando dois pares de cartas iguais. Quer dizer, duas cartas têm um número inteiro N marcado em uma de suas faces e as outras duas cartas têm um outro número inteiro M,N != M. Neste problema, o jogador já virou três cartas. Claro que, dadas as condições, a carta que falta virar vai formar par com uma das três que já foram viradas.  Implemente um programa que, dados os números de três cartas, imprima o número da carta que ainda falta virar!

Entrada
A primeira linha da entrada contém um inteiro A, representando a primeira carta aberta, a segunda linha contém um inteiro B, representando a segunda carta aberta e a terceira linha contém um inteiro C, representando a terceira carta aberta.

Saída
Seu programa deve imprimir uma linha contendo um inteiro representando o número que está na carta que ainda falta virar.

Restrições
0 <= A,B,C <= 100.
*/

import java.util.Scanner;
import java.util.Arrays;

public class Gustavo28 {
  public static void main(String[] args) {
    Scanner telcado = new Scanner(System.in);
    System.out.println("Digite o número da primeira carta aberta: ");
    int A = telcado.nextInt();
    System.out.println("Digite o número da segundaa carta aberta: ");
    int B = telcado.nextInt();
    System.out.println("Digite o número da terceira carta aberta: ");
    int C = telcado.nextInt();

    
    int vet[] = new int[3];
    vet[0] = A;
    vet[1] = B;
    vet[2] = C;

    Arrays.sort(vet);

    if((A>=0 && B>=0 && C>=0) && (A<=100 && B<=100 && C<=100)){
      if (A == B && B == C){
        System.out.println("pode n man");
      }
      else{
        if(vet[0] == vet[1]){
          System.out.println("A ultima carta é: "+vet[2]);
        }
        else if(vet[0] == vet[2]){
          System.out.println("A ultima carta é: "+vet[1]);
        }
        else if(vet[1] == vet[2]){
          System.out.println("A ultima carta é: "+vet[0]);
        }
        else{
          System.out.println("uai");
        }
      } 
    }
    else{
      System.out.println("Numeros inválidos");
    }
  }
}