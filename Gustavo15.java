/*
Implemente um algoritmo que receba de entrada um valor inteiro com 4 dígitos e verifique se o mesmo pertence à família dos binários. Para isto, “desmembre” o número informado e verifique se foram digitados somente bits. Caso o número informado seja binário, realize então a conversão do mesmo para decimal e imprima o resultado.
  */

import java.util.Scanner;

public class Gustavo15 {
    public static void main(String[] args) {
        int n = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int Num = teclado.nextInt();
        String numStr = Integer.toString(Num);
        String[] numSplit = numStr.split("");

        int decimal = 0;

        while (n < numStr.length()) {
            if (numSplit[n].equals("1") || numSplit[n].equals("0")) {
                if (numSplit[n].equals("1")) {
                    decimal += Math.pow(2, (numStr.length() - n - 1));
  
                }
                n = n + 1;
            } else {
                System.out.println("Não é um número binário.");
                break;
            }
        }
        if (n == numStr.length()) {
            System.out.println("O número em decimal é: " + decimal);
        }   
    }
}