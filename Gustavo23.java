/*
A regra do impedimento no futebol pode parecer estranha, mas sem ela, se a gente pensar bem, o jogo ficaria muito chato! Ela funciona dadas as posições de três jogadores: L o jogador atacante que lança a bola; R o jogador atacante que recebe a bola; e D o último jogador defensor. E a regra vale somente se o jogador R está no seu campo de ataque; se o jogador R está no seu campo de defesa ou na linha divisória do meio campo, ele não está em impedimento. Neste problema o campo tem 100 metros de comprimento. Dadas as posições desses três jogadores, no momento exato do lançamento, haverá impedimento se e somente se a seguinte condição for verdadeira: (R>50) e (L< R) e (R >D).

Entrada
A entrada é composta de apenas uma linha, contendo os três inteiros L, R e D.
Saída
Seu programa deve produzir uma única linha, contendo um único caractere, que deve ser "S" caso haja impedimento, ou "N" caso contrário.
Restrições
0 ≤ L ≤ 100
0 ≤ R ≤ 100
0 ≤ D ≤ 100
*/


import java.util.Scanner;

public class Gustavo23 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    
    System.out.println("Digite a posição do jogador que cruzou a bola, a do jogador que recebeu a bola e do ultimo zagueiro: ");
    String Posicoes = teclado.next();
    String[] Pslpit = Posicoes.split(",");

    int L = Integer.parseInt(Pslpit[0]);
    int R = Integer.parseInt(Pslpit[1]);
    int D = Integer.parseInt(Pslpit[2]);

    if (L>100 || R>100 || D>100 || L<0 || R<0 || D<0){
      System.out.println("Posições inválidas");
    }
    else{
      if((R > 50) && (L < R) && (R > D)){
        System.out.println("Tá impedido!");
      }
      else{
        System.out.println("Tá impedido não!");
      }
    }
  }
}