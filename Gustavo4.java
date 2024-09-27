/*Faça um programa que simule uma calculadora simples. Para isso, o usuário deverá entrar com dois números quaisquer e a operação que deseja realizar: '+' soma; ' - ' subtração; ' * ' multiplicação e ' / ' divisão. Lembre-se das condições para realizar a divisão.*/

import java.util.Scanner;

public class Gustavo4{
  public static void main(String[]args){
    Scanner teclado = new Scanner(System.in);
    System.out.println("Essa aqui é a sua calculadora, digite um número: ");
    double Num1 = teclado.nextDouble();

    System.out.println("\nDigite mais um número: ");
    double Num2 = teclado.nextDouble();

    System.out.println("\nVocê pode escolher dentre as seguintes operações: soma='+', subtração='-', Multiplicação='*', Divisão='/': ");
    String Operacao = teclado.next();
    
    if (Operacao.equals("+")){
      double Soma = Num1 + Num2;
      System.out.println(Soma);
    }
    else if(Operacao.equals("-")){
      double Sub = Num1 - Num2;
      System.out.println(Sub);
    }
    else if(Operacao.equals("*")){
      double Mult = Num1* Num2;
      System.out.println(Mult);
    }
    else if(Operacao.equals("/")){
      if (Num2 == 0){
        System.out.println("Pode dividir por 0 não mano");
      }
      else{
        double div = Num1/Num2;
        System.out.println(div);
      }
    }
    else{
      System.out.println("Não é uma operação válida para essa calculadora");
    }
  }
}