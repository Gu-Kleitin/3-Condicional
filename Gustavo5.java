/* 5. Faça um programa que solicite ao usuário que digite um caracter e em seguida imprima se o caracter digitado é ou não uma vogal.*/

import java.util.Scanner;

public class Gustavo5{
  public static void main(String[]args){
    Scanner teclado = new Scanner(System.in);
    System.out.println("Digite uma letra: ");
    String Letra = teclado.next();
    char caractere = Character.toLowerCase(Letra.charAt(0));
    if (caractere >= 'a' && caractere <= 'z'){
      switch(caractere){
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':
          System.out.println("É uma vogal");   
          break;
        default:
          System.out.println("É uma consoante");
        
      }
    }
    else{
      System.out.println("Não é uma letra");
    }
  }
}