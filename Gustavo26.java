/*
Joãozinho acaba de mudar de escola e a primeira coisa que percebeu na nova escola é que a gangorra do parquinho não é simétrica, uma das extremidades é mais longa que a outra. Após brincar algumas vezes com um amigo de mesmo peso, ele percebeu que quando está em uma extremidade, a gangorra se desequilibra para o lado dele (ou seja, ele fica na parte de baixo, e o amigo na parte de cima), mas quando eles trocam de lado, a gangorra se desequilibra para o lado do amigo.

Sem entender a situação, Joãozinho pediu ajuda a outro amigo de outra série, que explicou que o comprimento do lado interfere no equilíbrio da gangorra, pois a gangorra estará equilibrada quando P1*C1 = P2*C2 onde P1 e P2 são os pesos das crianças da direita e esquerda e C1 e C2 são os comprimentos do lado direito e esquerdo da Gangorra.

Com a equação, Joãozinho já consegue dizer se a gangorra está equilibrada ou não mas, além disso, ele quer saber para qual lado a gangorra descerá caso esteja desequilibrada.

Entrada
A primeira e única linha da entrada contém 4 inteiros,P1, P2, C1 e C2, nesta ordem.

Saída
Seu programa deve produzir uma única linha, contendo um único inteiro. Se a gangorra estiver equilibrada, imprima '0'. Se ela estiver desequilibrada de modo que a criança esquerda esteja na parte de baixo, imprima '-1', senão, imprima '1'.

Restrições
10 <= P1 <= 100
10 <= P2 <= 100
10 <= C1 <= 100
10 <= C2 <= 100
*/

import java.util.Scanner;

public class Gustavo26{
  public static void main(String[]args){
    Scanner teclado = new Scanner(System.in);
    System.out.println("Digite o peso e comprimento na parte direita e o peso e comprimento da parte esquerda respectivamente, separados por vírgula(1,1,1,1): ");
    String PeC = teclado.next();
    String[] PeCsplit = PeC.split(",");

    int P1 = Integer.parseInt(PeCsplit[0]);
    int C1 = Integer.parseInt(PeCsplit[1]);
    int P2 = Integer.parseInt(PeCsplit[2]);
    int C2 = Integer.parseInt(PeCsplit[3]);

    if ((P1>=10 && P1<=100) && (P2>=10 && P2<=100) && (C1>=10 && C1<=100) && (C2>=10 && C2<=100)){
      int P3 = P1*C1;
      int P4 = P2*C2;
      if (P3 == P4){
        System.out.println("0");
      }
      else{
        if (P3 > P4){
          System.out.println("-1");
        }
        else{
          System.out.println("1");
        }
      }
    }
    else{
      System.out.println("Tem que ser entre 10 e 100");
    }
  }
}