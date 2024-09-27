/*
17. Faça um algoritmo que receba três números e mostre-os em ordem crescente e decrescente.
  */

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Gustavo17{
  public static void main(String[]args){
    Scanner teclado = new Scanner(System.in);
    int A = 1;
    System.out.println("Digite um número: ");
    Double N1 = teclado.nextDouble();
    System.out.println("Digite mais um número: ");
    Double N2 = teclado.nextDouble();
    System.out.println("Digite mais um número: ");
    Double N3 = teclado.nextDouble();

    Double vet[] = new Double[3];
    vet[0]=N1;
    vet[1]=N2;
    vet[2]=N3;

    if (A == 1){
      Arrays.sort(vet);
      System.out.println("\nNúmeros em ordem crescente: ");
      for (int i=0; i < vet.length; i++){ 
        System.out.println(vet[i]);
      }

      System.out.println("\nNúmeros em ordem decrescente: ");
      Arrays.sort(vet, Collections.reverseOrder());
      for (int i=0; i < vet.length; i++){ 
        System.out.println(vet[i]);
      }
    }
    else{
      Arrays.sort(vet);
      System.out.println("\nNúmeros em ordem crescente: ");
      for (int i=0; i < vet.length; i++){ 
        System.out.println(vet[i]);
      }

      System.out.println("\nNúmeros em ordem decrescente: ");
      Arrays.sort(vet, Collections.reverseOrder());
      for (int i=0; i < vet.length; i++){ 
        System.out.println(vet[i]);
      }
    }
  }
}