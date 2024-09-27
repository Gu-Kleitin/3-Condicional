/*
O IMC (Índice de Massa Corporal) é um critério da Organização Mundial de Saúde para dar uma indicação sobre a condição de peso de uma pessoa adulta. A fórmula é IMC = PESO/(ALTURA2). Elabore um algoritmo que leia o peso e a altura de um adulto e mostre sua condição.
  */

import java.util.Scanner;

public class Gustavo9{
  public static void main(String[]args){
    Scanner teclado = new Scanner(System.in);
    System.out.println("Preciso que me forneça seu peso: ");
    float Peso = teclado.nextFloat();

    System.out.println("Agora me informe sua altura: ");
    float Altura = teclado.nextFloat();

    double IMC = Peso / (Math.pow(Altura,2));

    if (IMC < 18.5){
      System.out.printf("Seu peso é %.2f, sua altura é %.2f e seu IMC é %.2f, logo, você está abaixo do peso chapa\n", Peso, Altura, IMC);
    }
    else if(IMC >= 18.5 && IMC < 25){
      System.out.printf("Seu peso é %.2f, sua altura é %.2f e seu IMC é %.2f, logo, você está no peso normal\n", Peso, Altura, IMC);
    }
    else if(IMC >= 25 && IMC < 30){
      System.out.printf("Seu peso é %.2f, sua altura é %.2f e seu IMC é %.2f, logo, você está acima do peso Duque/Duquesa de Coxinhas\n", Peso, Altura, IMC);
    }
    else{
      System.out.printf("Seu peso é %.2f, sua altura é %.2f e seu IMC é %.2f, logo, você está obeso Sr. Martin Burger King/ Sra. Carlota Bolaxinha\n", Peso, Altura, IMC);
    }
    
  }
}