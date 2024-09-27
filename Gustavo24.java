/*
Quatro amigos combinaram de jogar tênis em duplas. Cada um dos amigos tem um nível de jogo, que é representado por um número inteiro: quanto maior o número, melhor o nível do jogador.

Os quatro amigos querem formar as duplas para iniciar o jogo. De forma a tornar o jogo mais interessante, eles querem que os níveis dos dois times formados sejam o mais próximo possível. O nível de um time é a soma dos níveis dos jogadores do time.

Embora eles sejam muito bons jogadores de tênis, os quatro amigos não são muito bons em algumas outras coisas, como lógica ou matemática. Você pode ajudá-los e encontrar a menor diferença possível entre os níveis dos times que podem ser formados?

Entrada
A entrada contém quatro linhas, cada linha contendo um inteiro A, B, C e D, indicando o nível de jogo dos quatro amigos.

Saída
Seu programa deve produzir uma única linha, contendo um único inteiro, a menor diferença entre os níveis dos dois times formados.

Restrições
0 ≤ A ≤ B ≤ C ≤ D ≤ 104
*/

import java.util.Scanner;
import java.util.Arrays;

public class Gustavo24{
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o nível de jogo dos quatro amigos(1,2,4,5): ");
        String Nivel = teclado.next();
        String[] Nivelsplit = Nivel.split(",");
        
        int A = Integer.parseInt(Nivelsplit[0]);
        int B = Integer.parseInt(Nivelsplit[1]);
        int C = Integer.parseInt(Nivelsplit[2]);
        int D = Integer.parseInt(Nivelsplit[3]);
        
        if ((A>=1 && B>= 1 && C>= 1 && D>= 1) && (A<=104 && B<=104 && C<=104 && D<=104)){
            int vet[] = new int[4];
            vet[0] = A;
            vet[1] = B;
            vet[2] = C;
            vet[3] = D;
            Arrays.sort(vet);
            int TimeA = vet[0]+vet[3];
            int TimeB = vet[1]+vet[2];
            int diferenca = Math.abs(TimeA-TimeB);
            System.out.println("A diferença entre os níveis dos dois times é: "+diferenca);
        }
        else{
            System.out.println("Tu quer colocar um número negativo ou maior que 104?\n Pode não");
        }
    }
}